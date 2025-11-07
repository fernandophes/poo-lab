package br.edu.ufersa.cc.lpoo.number_expressions;

/**
 * ABSTRACT EXPRESSION (Componente)
 * Define a operação de interpretação comum a todas as classes.
 */
public interface Expression {

    /**
     * Interpreta a expressão, retornando o resultado da avaliação.
     * 
     * @return O valor numérico da expressão.
     */
    double interpret();
}
