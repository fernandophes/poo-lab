package br.edu.ufersa.cc.poo_lab.adapter;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        final var shortAddress = new ShortAddress();
        shortAddress.setZip("59.625-900");
        shortAddress.setNumber("572");
        System.err.println("| Endereço curto criado");
        System.err.println(shortAddress);

        final var event = new Event();
        event.setTitle("Apresentação do Adapter");
        event.setStart(LocalDateTime.of(2025, 9, 26, 13, 55));
        event.setEnd(LocalDateTime.of(2025, 9, 26, 15, 45));

        // Não aceita, pois são tipos diferentes
        // event.setAddress(shortAddress);

        final var adaptedAddress = new ShortAddressAdapter(shortAddress);
        System.err.println();
        System.err.println("| Endereço adaptado");
        System.err.println(adaptedAddress);

        // Funciona
        event.setAddress(adaptedAddress);
        System.err.println();
        System.err.println("| Evento preenchido");
        System.err.println(event);
    }
}
