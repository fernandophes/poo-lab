package br.edu.ufersa.cc.poo_lab.logger;

/**
 * Classe abstrata do Logger (foco em: O QUÊ o logger deve oferecer?)
 */
public abstract class Logger {

    protected String name;

    Logger(final String name) {
        this.name = name;
    }

    public abstract void info(String base, Object... params);

}
