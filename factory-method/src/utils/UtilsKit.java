package utils;

import logger.Logger;

public interface UtilsKit {

    String getClassName(Class<?> clazz);

    Logger createLogger(String name);

    default Logger createLogger(final Class<?> clazz) {
        return createLogger(getClassName(clazz));
    }

}
