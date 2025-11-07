package br.edu.ufersa.cc.lpoo.number_expressions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Representa a operação de Divisão (/).
 */
@AllArgsConstructor
@Slf4j
public class DivisionExpression implements Expression {

    private final Expression leftOperand;
    private final Expression rightOperand;

    @Override
    public double interpret() {
        double right = rightOperand.interpret();

        if (right == 0) {
            log.error("Tentativa de divisão por zero!");
            throw new ArithmeticException("Division by zero");
        }

        double left = leftOperand.interpret();

        log.info("Interpretando Divisão: {} / {}", left, right);

        return left / right;
    }

}
