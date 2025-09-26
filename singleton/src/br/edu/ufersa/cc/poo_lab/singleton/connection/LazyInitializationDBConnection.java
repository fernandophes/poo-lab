package br.edu.ufersa.cc.poo_lab.singleton.connection;

import java.util.Random;

public class LazyInitializationDBConnection implements DatabaseConnection {

    private static final Random RANDOM = new Random();
    private static LazyInitializationDBConnection instance;

    private final long identifier = RANDOM.nextLong(0, 100);

    private LazyInitializationDBConnection() {
    }

    public static LazyInitializationDBConnection getInstance() {
        if (instance == null) {
            instance = new LazyInitializationDBConnection();
        }

        return instance;
    }

    @Override
    public String query() {
        return """
                Query realizada
                Conexão do tipo %s
                Identificador do objeto: %s
                """
                .formatted(getClass().getSimpleName(), identifier);
    }

}
