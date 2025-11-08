package br.edu.ufersa.cc.lpoo.commands;

import br.edu.ufersa.cc.lpoo.contracts.Command;
import br.edu.ufersa.cc.lpoo.receivers.AirConditioner;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SetAcTempCommand implements Command {

    private AirConditioner ac;
    private int temperature;

    @Override
    public void execute() {
        ac.turnOn();
        ac.setTemperature(temperature);
    }

}
