package br.edu.ufersa.cc.lpoo.invokers;

import br.edu.ufersa.cc.lpoo.commands.NoCommand;
import br.edu.ufersa.cc.lpoo.contracts.Command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        // Inicializa os slots com o Command Nulo para evitar null checks
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    // Método para configurar o slot (parâmetro)
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        System.out.println("Slot " + slot + " configurado.");
    }

    // Método que o cliente chama
    public void pressOnButton(int slot) {
        System.out.println("\n--- Pressionando ON no Slot " + slot + " ---");
        onCommands[slot].execute(); // O Invoker apenas chama execute()
    }

    // Método que o cliente chama
    public void pressOffButton(int slot) {
        System.out.println("\n--- Pressionando OFF no Slot " + slot + " ---");
        offCommands[slot].execute(); // O Invoker apenas chama execute()
    }

}
