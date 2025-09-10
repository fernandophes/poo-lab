package utils;

import logger.Logger;
import logger.SimpleLogger;

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
