package br.edu.ufersa.cc.lpoo.token.handlers.contracts;

import br.edu.ufersa.cc.lpoo.token.Token;

public interface TokenHandler {

    static TokenHandler link(TokenHandler first, TokenHandler... others) {
        var current = first;

        for (final var next : others) {
            current.setNext(next);
            current = next;
        }

        return first;
    }

    Token getToken();

    void setNext(TokenHandler next);

}
