package br.edu.ufersa.cc.lpoo.token;

import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;

import lombok.Value;

@Value
public class Token {

    String hash;
    LocalDateTime expiration;

    public boolean isExpired() {
        return expiration != null && expiration.isBefore(LocalDateTime.now());
    }

    public boolean isValid() {
        return StringUtils.isNotBlank(hash) && !isExpired();
    }

}
