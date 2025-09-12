package br.edu.ufersa.cc.poo_lab;

import java.util.List;

import br.edu.ufersa.cc.poo_lab.logger.Logger;
import br.edu.ufersa.cc.poo_lab.models.User;
import br.edu.ufersa.cc.poo_lab.query_builder.QueryBuilder;
import br.edu.ufersa.cc.poo_lab.user_builder.UserBuilder;

public class DatabaseOrm {

    private static final String EXAMPLE_NAME = "João da Silva";
    private static final String EXAMPLE_EMAIL = "joao@email.com";
    private static final String EXAMPLE_PHONE = "+55 (84) 9 8765-4321";

    private QueryBuilder queryBuilder;
    private UserBuilder userBuilder;
    private Logger logger;

    public DatabaseOrm(QueryBuilder queryBuilder, UserBuilder userBuilder, Logger logger) {
        this.queryBuilder = queryBuilder;
        this.userBuilder = userBuilder;
        this.logger = logger;
    }

    public List<User> listAll(int pageNumber, int pageSize) {

        final var query = queryBuilder
                .select("name", "email", "phone")
                .from("users")
                .where("active = true")
                .limit(pageSize)
                .offset(pageSize * (pageNumber - 1))
                .build();

        logger.info(query);
        return List.of(getExample());
    }

    public User findById(long id) {

        final var query = queryBuilder
                .select("name", "email", "phone")
                .from("users")
                .where("active = true", "id = " + id)
                .limit(1)
                .build();

        logger.info(query);
        return getExample();
    }

    private User getExample() {
        return userBuilder
                .reset()
                .setName(EXAMPLE_NAME)
                .setEmail(EXAMPLE_EMAIL)
                .setPhone(EXAMPLE_PHONE)
                .build();
    }

}
