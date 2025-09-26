package br.edu.ufersa.cc.poo_lab;

import br.edu.ufersa.cc.poo_lab.logger.DetailedLogger;
import br.edu.ufersa.cc.poo_lab.models.User;
import br.edu.ufersa.cc.poo_lab.query_builder.PostgresQueryBuilder;
import br.edu.ufersa.cc.poo_lab.user_builder.OptimizedUserBuilder;

/**
 * A ideia da aplicação é buscar usuários em um banco de dados fictício.
 * 
 * Para isso, temos um Builder para construir as queries SQL que fazem essas
 * buscas.
 * O User também pode ser construído via Builder.
 */
public class App {
    public static void main(String[] args) {
        /*
         * DEFINIÇÃO DAS DEPENDÊNCIAS
         */

        // Builder de Query SQL - Pode ser MySQL ou Postgres, existem diferenças na
        // escrita das consultas
        final var queryBuilder = new PostgresQueryBuilder();

        // Builder de User - Podemos formatar com um estilo antigo (Legacy) ou otimizado
        final var userBuilder = new OptimizedUserBuilder();

        // Logger - Pode ser simples ou detalhado (aproveitei o exemplo da aula passada)
        final var logger = new DetailedLogger("UserService");

        /*
         * PAPEL DO DIRETOR (DatabaseOrm)
         * Passamos as dependências no seu construtor
         */
        final var orm = new DatabaseOrm(queryBuilder, userBuilder, logger);

        /*
         * "CHAMADA" SQL (fictícia)
         * O que importa pra o exemplo é a query
         */
        final var allUsers = orm.listAll(1, 10);

        // Impressão em log
        logger.info("TODOS OS USUÁRIOS:\n%s", allUsers.stream().map(User::toString).toList());
    }

}
