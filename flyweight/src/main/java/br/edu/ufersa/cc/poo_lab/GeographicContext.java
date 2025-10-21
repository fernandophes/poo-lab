package br.edu.ufersa.cc.poo_lab;

import lombok.Value;

/*
 * A classe Flyweight :)
 */

@Value
public class GeographicContext {

    private final String country;
    private final String state;
    private final String city;
    private final String neighborhood;

    public void displayContext() {
        System.out.printf("[Flyweight] %s, %s - %s (%s)%n", neighborhood, city, state, country);
    }

}