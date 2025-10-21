package br.edu.ufersa.cc.poo_lab;

import lombok.val;

public class Main {
    public static void main(String[] args) {

        val country = "Brasil";
        val state = "SP";
        val city = "São Paulo";
        val neighborhoodA = "Vila Olímpia";
        val neighborhoodB = "Jardins";

        val contextA = GeographicContextFactory.getContext(country, state, city, neighborhoodA);
        val address1 = new ClientAddress(contextA, "Rua do Cliente A", "100", "Apto 101", "04543-010");

        val contextAShared = GeographicContextFactory.getContext(country, state, city, neighborhoodA);
        val address2 = new ClientAddress(contextAShared, "Avenida do Cliente B", "550", "Sala Comercial",
                "04543-900");

        val contextB = GeographicContextFactory.getContext(country, state, city, neighborhoodB);
        val address3 = new ClientAddress(contextB, "Alameda do Cliente C", "1500", "", "01420-002");

        System.out.println("\n--- Demonstração de Endereços ---\n");
        address1.displayFullAddress();
        address2.displayFullAddress();
        address3.displayFullAddress();

        System.out.println("\n--- Análise de Flyweights (Economia de Memória) ---");

        System.out.println("Total de Flyweights únicos em cache: " + GeographicContextFactory.getCacheSize());

        val isShared = (contextA == contextAShared);
        System.out.println(
                "O Contexto Geográfico da Vila Olímpia foi COMPARTILHADO (mesma referência de objeto)? " + isShared);

        System.out.println(
                "\nIsto significa que 3 objetos de endereço (ClientAddress) utilizam apenas 2 objetos pesados (GeographicContext).");
    }
}