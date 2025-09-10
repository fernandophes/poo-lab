package logger;

public abstract class Logger {

    protected String name;

    public Logger(final String name) {
        this.name = name;
    }

    public abstract void info(String base, Object... params);

}
