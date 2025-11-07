package br.edu.ufersa.cc.lpoo.number_expressions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Representa a operação de Subtração (-).
 */
@AllArgsConstructor
@Slf4j
public class SubtractionExpression implements Expression {

    private final Expression leftOperand;
    private final Expression rightOperand;

    @Override
    public double interpret() {
        double left = leftOperand.interpret();
        double right = rightOperand.interpret();

        log.info("Interpretando Subtração: {} - {}", left, right);

        return left - right;
    }

}
