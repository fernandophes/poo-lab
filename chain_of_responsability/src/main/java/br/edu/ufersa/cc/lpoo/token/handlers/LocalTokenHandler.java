package br.edu.ufersa.cc.lpoo.token.handlers;

import br.edu.ufersa.cc.lpoo.token.Token;
import br.edu.ufersa.cc.lpoo.token.handlers.contracts.BaseTokenHandler;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalTokenHandler extends BaseTokenHandler {

    @Setter(value = AccessLevel.PRIVATE)
    private static Token localToken;

    @Override
    protected Token obtainToken() {
        log.info("Obtendo token local...");
        log.info("Token local: {}", localToken);

        return localToken;
    }

    protected Token update(final Token token) {
        log.info("Atualizando token local...");
        setLocalToken(token);
        return localToken;
    }

}
