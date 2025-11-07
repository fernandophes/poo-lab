package br.edu.ufersa.cc.lpoo.services;

import br.edu.ufersa.cc.lpoo.token.Token;
import br.edu.ufersa.cc.lpoo.token.handlers.LocalTokenHandler;
import br.edu.ufersa.cc.lpoo.token.handlers.RedisTokenHandler;
import br.edu.ufersa.cc.lpoo.token.handlers.contracts.ApiTokenHandler;
import br.edu.ufersa.cc.lpoo.token.handlers.contracts.TokenHandler;

public class TokenService {

    private final TokenHandler tokenHandlerChain;

    public TokenService(final ApiService apiService) {
        tokenHandlerChain = TokenHandler.link(
                new LocalTokenHandler(),
                new RedisTokenHandler(),
                new ApiTokenHandler(apiService));
    }

    public Token getToken() {
        return tokenHandlerChain.getToken();
    }

}
