package br.edu.ufersa.cc.lpoo.token.handlers.contracts;

import br.edu.ufersa.cc.lpoo.token.Token;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseTokenHandler implements TokenHandler {

    private TokenHandler next;

    protected abstract Token obtainToken();

    protected abstract Token update(Token token);

    @Override
    public void setNext(final TokenHandler next) {
        this.next = next;
    }

    @Override
    public final Token getToken() {
        final var token = obtainToken();

        if (token != null && token.isValid()) {
            return token;
        } else {
            log.warn("O token obtido é nulo ou inválido!\nToken recebido: {}", token);
            return update(getTokenFromNextOrFail());
        }
    }

    protected Token getTokenFromNextOrFail() {
        if (next != null) {
            return next.getToken();
        } else {
            throw new RuntimeException("Não há mais handlers");
        }
    }

}
