package br.edu.ufersa.cc.lpoo.number_expressions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Representa a operação de Potenciação (^).
 */
@AllArgsConstructor
@Slf4j
public class PowExpression implements Expression {

    private final Expression leftOperand;
    private final Expression rightOperand;

    @Override
    public double interpret() {
        double left = leftOperand.interpret();
        double right = rightOperand.interpret();

        log.info("Interpretando Potenciação: {} ^ {}", left, right);

        return Math.pow(left, right);
    }

}
