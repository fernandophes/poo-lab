package br.edu.ufersa.cc.lpoo.commands;

import br.edu.ufersa.cc.lpoo.contracts.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        // Nada acontece. Representa um botão não configurado.
    }

}
