package br.edu.ufersa.cc.poo_lab.utils;

import br.edu.ufersa.cc.poo_lab.logger.Logger;
import br.edu.ufersa.cc.poo_lab.logger.SimpleLogger;

public class SimpleUtilsKit implements UtilsKit {

    @Override
    public Logger createLogger(final String name) {
        return new SimpleLogger(name);
    }

    @Override
    public String getClassName(Class<?> clazz) {
        return clazz.getSimpleName();
    }

}
