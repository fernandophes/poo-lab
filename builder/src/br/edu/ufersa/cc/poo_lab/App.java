package br.edu.ufersa.cc.poo_lab;

import br.edu.ufersa.cc.poo_lab.logger.DetailedLogger;
import br.edu.ufersa.cc.poo_lab.models.User;
import br.edu.ufersa.cc.poo_lab.query_builder.PostgresQueryBuilder;

public class App {
    public static void main(String[] args) {
        // Dependências
        final var builder = new PostgresQueryBuilder();
        final var logger = new DetailedLogger("UserService");

        // Diretor
        final var orm = new DatabaseOrm(builder, logger);

        // Utilização
        final var allUsers = orm.listAll(1, 10);

        // Impressão em log
        logger.info("TODOS OS USUÁRIOS:\n%s", allUsers.stream().map(User::toString).toList());
    }

}
