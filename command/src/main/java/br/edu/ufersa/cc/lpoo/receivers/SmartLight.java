package br.edu.ufersa.cc.lpoo.receivers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SmartLight {

    private String location;

    public void turnOn() {
        System.out.println(location + " Lâmpada: está LIGADA.");
    }

    public void turnOff() {
        System.out.println(location + " Lâmpada: está DESLIGADA.");
    }

}
