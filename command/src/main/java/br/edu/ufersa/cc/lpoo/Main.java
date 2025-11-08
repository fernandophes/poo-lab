package br.edu.ufersa.cc.lpoo;

import br.edu.ufersa.cc.lpoo.commands.LightOnCommand;
import br.edu.ufersa.cc.lpoo.commands.SetAcTempCommand;
import br.edu.ufersa.cc.lpoo.contracts.Command;
import br.edu.ufersa.cc.lpoo.invokers.RemoteControl;
import br.edu.ufersa.cc.lpoo.receivers.AirConditioner;
import br.edu.ufersa.cc.lpoo.receivers.SmartLight;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Implementação do Padrão COMMAND: Controle Remoto ---");

        // 1. O CLIENTE CRIA O INVOKER
        RemoteControl remote = new RemoteControl();

        // 2. O CLIENTE CRIA OS RECEIVERS (dispositivos)
        SmartLight livingRoomLight = new SmartLight("Sala de Estar");
        AirConditioner bedroomAC = new AirConditioner("Quarto");

        // 3. O CLIENTE CRIA OS COMMANDS CONCRETOS
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);

        // Note que o comando do AC é mais complexo, pois carrega o estado (20)
        Command bedroomAcOn20 = new SetAcTempCommand(bedroomAC, 20);

        // Criando comandos de desligar simples (para demonstração)
        Command lightOff = livingRoomLight::turnOff;
        Command acOff = bedroomAC::turnOff;

        // 4. O CLIENTE ATRIBUI OS COMMANDS AOS SLOTS DO INVOKER (PROGRAMAÇÃO)
        remote.setCommand(0, livingRoomLightOn, lightOff);
        remote.setCommand(1, bedroomAcOn20, acOff);

        System.out.println("\n-- PRONTO PARA USAR --");

        // 5. O CLIENTE (ou o usuário final) INTERAGE COM O INVOKER

        // Ação 1: Liga a luz da sala (Slot 0)
        remote.pressOnButton(0);

        // Ação 2: Liga e programa o AC do quarto para 20°C (Slot 1)
        remote.pressOnButton(1);

        // Ação 3: Desliga o AC do quarto (Slot 1)
        remote.pressOffButton(1);

        // Ação 4: Botão não configurado (demonstra NoCommand)
        remote.pressOnButton(3);
    }

}
