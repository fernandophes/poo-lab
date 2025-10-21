package br.edu.ufersa.cc.poo_lab;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ClientAddress {

    // Flyweight sendo referenciado
    private final GeographicContext sharedContext;

    private String street;
    private String number;
    private String complement;
    private String zipCode;

    public void displayFullAddress() {
        System.out.printf("Endereço: %s, %s - CEP %s%n", street, number, zipCode);
        System.out.println("  Localidade:\n");
        sharedContext.displayContext();

        System.out.println("---");
    }
}