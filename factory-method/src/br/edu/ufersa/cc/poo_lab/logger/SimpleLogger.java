package br.edu.ufersa.cc.poo_lab.logger;

/**
 * Implementação do Logger (foco em: COMO o logger deve oferecer o contratado?)
 * Nesse caso, é um Logger simples e enxuto, apenas com as informações
 * primordiais.
 */
public class SimpleLogger extends Logger {

    public SimpleLogger(final String name) {
        super(name);
    }

    @Override
    public void info(String base, Object... params) {
        final var builder = new StringBuilder();

        builder
                .append(name).append(" | ")
                .append("INFO: ")
                .append(String.format(base, params));

        System.out.println(builder.toString());
    }

}
