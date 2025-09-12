package br.edu.ufersa.cc.poo_lab;

import java.util.List;

import br.edu.ufersa.cc.poo_lab.logger.Logger;
import br.edu.ufersa.cc.poo_lab.models.User;
import br.edu.ufersa.cc.poo_lab.query_builder.QueryBuilder;

public class DatabaseOrm {

    private static final User USER_EXAMPLE = new User("João", "joao@email.com", "987654321");
    private static final List<User> USER_LIST_EXAMPLE = List.of(USER_EXAMPLE);

    private QueryBuilder queryBuilder;
    private Logger logger;

    public DatabaseOrm(QueryBuilder queryBuilder, Logger logger) {
        this.queryBuilder = queryBuilder;
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
        return USER_LIST_EXAMPLE;
    }

    public List<User> findById(long id) {

        final var query = queryBuilder
                .select("name", "email", "phone")
                .from("users")
                .where("active = true", "id = " + id)
                .limit(1)
                .build();

        logger.info(query);
        return USER_LIST_EXAMPLE;
    }

}
