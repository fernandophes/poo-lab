package br.edu.ufersa.cc.lpoo.services;

import java.time.LocalDateTime;

import org.apache.commons.lang3.RandomStringUtils;

import br.edu.ufersa.cc.lpoo.token.Token;

public class ApiService {

    public Token getNewToken() {
        final var hash = RandomStringUtils.secure()
                .nextAlphanumeric(32);
        final var expiration = LocalDateTime.now().plusSeconds(10);

        return new Token(hash, expiration);
    }

}
