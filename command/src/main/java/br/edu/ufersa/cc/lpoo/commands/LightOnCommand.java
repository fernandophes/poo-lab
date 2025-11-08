package br.edu.ufersa.cc.lpoo.commands;

import br.edu.ufersa.cc.lpoo.contracts.Command;
import br.edu.ufersa.cc.lpoo.receivers.SmartLight;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LightOnCommand implements Command {

    private SmartLight light;

    @Override
    public void execute() {
        light.turnOn();
    }

}
