package br.edu.ufersa.cc.poo_lab.query_builder;

import java.util.ArrayList;
import java.util.List;

public class PostgresQueryBuilder implements QueryBuilder {

    private List<String> parts = new ArrayList<>();

    @Override
    public QueryBuilder reset() {
        parts.clear();
        return this;
    }

    @Override
    public QueryBuilder select(String... columns) {
        parts.add("SELECT " + String.join(", ", columns));
        return this;
    }

    @Override
    public QueryBuilder from(String table) {
        parts.add("FROM " + table);
        return this;
    }

    @Override
    public QueryBuilder where(String... conditions) {
        parts.add("WHERE " + String.join(" AND ", conditions));
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        parts.add("FETCH FIRST " + limit + " ROWS ONLY");
        return this;
    }

    @Override
    public QueryBuilder offset(int offset) {
        parts.add("OFFSET " + offset + " ROWS");
        return this;
    }

    @Override
    public QueryBuilder orderBy(String... columns) {
        parts.add("ORDER BY " + String.join(", ", columns));
        return this;
    }

    @Override
    public String build() {
        return parts.stream()
                .reduce("", (accumulator, part) -> String.join(" ", accumulator, part));
    }

}
