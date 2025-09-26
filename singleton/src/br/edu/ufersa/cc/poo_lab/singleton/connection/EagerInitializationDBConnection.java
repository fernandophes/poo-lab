package br.edu.ufersa.cc.poo_lab.singleton.connection;

import java.util.Random;

public class EagerInitializationDBConnection implements DatabaseConnection {

    private static final Random RANDOM = new Random();
    private static final EagerInitializationDBConnection instance = new EagerInitializationDBConnection();

    private final long identifier = RANDOM.nextLong(0, 100);

    private EagerInitializationDBConnection() {
    }

    public static EagerInitializationDBConnection getInstance() {
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
