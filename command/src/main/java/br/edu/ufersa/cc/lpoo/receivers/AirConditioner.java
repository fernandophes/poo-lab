package br.edu.ufersa.cc.lpoo.receivers;

import lombok.Data;

@Data
public class AirConditioner {

    private String location;
    private int temperature = 18;

    public AirConditioner(String location) {
        this.location = location;
    }

    public void turnOn() {
        System.out.println(location + " Ar-Condicionado: está LIGADO.");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println(location + " Ar-Condicionado: temperatura ajustada para " + temperature + "°C.");
    }

    public void turnOff() {
        System.out.println(location + " Ar-Condicionado: está DESLIGADO.");
    }

}
