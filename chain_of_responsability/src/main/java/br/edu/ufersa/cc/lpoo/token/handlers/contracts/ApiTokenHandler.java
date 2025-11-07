package br.edu.ufersa.cc.lpoo.token.handlers.contracts;

import br.edu.ufersa.cc.lpoo.services.ApiService;
import br.edu.ufersa.cc.lpoo.token.Token;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ApiTokenHandler extends BaseTokenHandler {

    private final ApiService apiService;

    @Override
    protected Token obtainToken() {
        log.info("Obtendo token da API...");
        final var apiToken = apiService.getNewToken();

        log.info("Token da API: {}", apiToken);
        return apiToken;
    }

    @Override
    protected Token update(final Token token) {
        log.info("Atualizando token da API...");
        return token;
    }

}
