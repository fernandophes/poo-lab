package br.edu.ufersa.cc.poo_lab.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DetailedLogger extends Logger {

    public DetailedLogger(final String name) {
        super(name);
    }

    @Override
    public void info(String base, Object... params) {
        final var builder = new StringBuilder();

        builder
                .append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss"))).append(" | ")
                .append(name)
                .append(" [")
                .append(Thread.currentThread().getName())
                .append("]")
                .append(" | ")
                .append("INFO: ")
                .append(String.format(base, params));

        System.out.println(builder.toString());
    }

}
