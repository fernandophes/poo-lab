package utils;

import logger.DetailedLogger;
import logger.Logger;

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
