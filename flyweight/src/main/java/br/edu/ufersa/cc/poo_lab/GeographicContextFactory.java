package br.edu.ufersa.cc.poo_lab;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.val;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GeographicContextFactory {

    private static final String KEY_DELIMITER = "|";
    private static final Map<String, GeographicContext> contextCache = new ConcurrentHashMap<>();

    public static GeographicContext getContext(final String country, final String state, final String city,
            final String neighborhood) {
        val key = country + KEY_DELIMITER + state + KEY_DELIMITER + city + KEY_DELIMITER + neighborhood;

        return contextCache.computeIfAbsent(key, k -> {
            System.out.println(">>> Criando NOVO Flyweight: " + key);
            return new GeographicContext(country, state, city, neighborhood);
        });
    }

    public static int getCacheSize() {
        return contextCache.size();
    }

}