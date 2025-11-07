package br.edu.ufersa.cc.lpoo;

import br.edu.ufersa.cc.lpoo.services.ApiService;
import br.edu.ufersa.cc.lpoo.services.TokenService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Obtendo token...");

        final var apiService = new ApiService();
        final var tokenService = new TokenService(apiService);

        final var token = tokenService.getToken();
        log.info("Token oficial: {}", token);
    }

}
