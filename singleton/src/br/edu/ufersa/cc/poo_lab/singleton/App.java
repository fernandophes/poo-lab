package br.edu.ufersa.cc.poo_lab.singleton;

import br.edu.ufersa.cc.poo_lab.singleton.connection.EagerInitializationDBConnection;
import br.edu.ufersa.cc.poo_lab.singleton.connection.LazyInitializationDBConnection;

public class App {
    public static void main(String[] args) {
        final var service = new Service(LazyInitializationDBConnection.getInstance());
        final var service2 = new Service(LazyInitializationDBConnection.getInstance());

        System.out.println(service.runQuery());
        System.out.println(service2.runQuery());

        final var service3 = new Service(EagerInitializationDBConnection.getInstance());
        final var service4 = new Service(EagerInitializationDBConnection.getInstance());

        System.out.println(service3.runQuery());
        System.out.println(service4.runQuery());
    }
}
