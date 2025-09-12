package br.edu.ufersa.cc.poo_lab.utils;

import br.edu.ufersa.cc.poo_lab.logger.DetailedLogger;
import br.edu.ufersa.cc.poo_lab.logger.Logger;

public class DetailedUtilsKit implements UtilsKit {

    @Override
    public Logger createLogger(final String name) {
        return new DetailedLogger(name);
    }

    @Override
    public String getClassName(Class<?> clazz) {
        return clazz.getName();
    }

}
