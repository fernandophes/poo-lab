package br.edu.ufersa.cc.lpoo.number_expressions;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

/**
 * TERMINAL EXPRESSION (Folha)
 * Representa um valor numérico (a parte mais básica da gramática).
 */
@Value
@Slf4j
public class NumberExpression implements Expression {

    private final double value;

    @Override
    public double interpret() {
        log.info("Interpretando número: {}", value);
        return value;
    }

}
