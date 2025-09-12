package br.edu.ufersa.cc.poo_lab.query_builder;

public interface QueryBuilder {

    QueryBuilder reset();

    QueryBuilder select(String... columns);

    QueryBuilder from(String table);

    QueryBuilder where(String... conditions);

    QueryBuilder limit(int limit);

    QueryBuilder offset(int offset);

    QueryBuilder orderBy(String... columns);

    String build();

}
