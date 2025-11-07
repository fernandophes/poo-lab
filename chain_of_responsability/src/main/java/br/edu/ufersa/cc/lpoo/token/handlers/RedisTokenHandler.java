package br.edu.ufersa.cc.lpoo.token.handlers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import br.edu.ufersa.cc.lpoo.token.Token;
import br.edu.ufersa.cc.lpoo.token.handlers.contracts.BaseTokenHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedisTokenHandler extends BaseTokenHandler {

    private static final String TOKEN_HASH = "TOKEN_HASH";
    private static final String TOKEN_EXPIRATION = "TOKEN_EXPIRATION";

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final Map<String, String> DATABASE = new HashMap<>();

    @Override
    protected Token obtainToken() {
        log.info("Obtendo token do Redis...");

        final var hash = DATABASE.get(TOKEN_HASH);
        final var expirationString = DATABASE.get(TOKEN_EXPIRATION);

        if (StringUtils.isNotBlank(hash) && StringUtils.isNotBlank(expirationString)) {
            final var expiration = LocalDateTime.parse(expirationString, FORMATTER);
            final var redisToken = new Token(hash, expiration);

            log.info("Token do Redis: {}", redisToken);
            return redisToken;
        } else {
            log.warn("Nenhum token no Redis");
            return new Token(null, null);
        }
    }

    protected Token update(final Token token) {
        log.info("Atualizando token do Redis...");

        DATABASE.put(TOKEN_HASH, token.getHash());
        DATABASE.put(TOKEN_EXPIRATION, token.getExpiration().format(FORMATTER));

        return token;
    }

}
