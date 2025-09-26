package br.edu.ufersa.cc.poo_lab.singleton;

import br.edu.ufersa.cc.poo_lab.singleton.connection.DatabaseConnection;

public class Service {

    private DatabaseConnection connection;

    public Service(DatabaseConnection connection) {
        this.connection = connection;
    }

    public String runQuery() {
        return connection.query();
    }

}
