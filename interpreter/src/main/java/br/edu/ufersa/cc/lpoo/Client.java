package br.edu.ufersa.cc.lpoo;

import br.edu.ufersa.cc.lpoo.number_expressions.AdditionExpression;
import br.edu.ufersa.cc.lpoo.number_expressions.DivisionExpression;
import br.edu.ufersa.cc.lpoo.number_expressions.Expression;
import br.edu.ufersa.cc.lpoo.number_expressions.MultiplicationExpression;
import br.edu.ufersa.cc.lpoo.number_expressions.NumberExpression;
import br.edu.ufersa.cc.lpoo.number_expressions.PowExpression;

public class Client {

    // Exemplo de Expressão: (5 + 10) * (3 ^ 2) * (20 / 4)
    public static Expression buildExpression() {

        // 1. Criando a sub-árvore da esquerda: (5 + 10)
        Expression num5 = new NumberExpression(5);
        Expression num10 = new NumberExpression(10);
        Expression leftSide = new AdditionExpression(num5, num10); // Addition(5, 10)

        Expression num3 = new NumberExpression(3);
        Expression num2 = new NumberExpression(2);
        Expression middleExpression = new PowExpression(num3, num2);

        // 2. Criando a sub-árvore da direita: (20 / 4)
        Expression num20 = new NumberExpression(20);
        Expression num4 = new NumberExpression(4);
        Expression rightSide = new DivisionExpression(num20, num4); // Division(20, 4)

        // 3. Criando a raiz (Root): Multiplicação

        Expression firstPart = new MultiplicationExpression(leftSide, middleExpression);
        return new MultiplicationExpression(firstPart, rightSide);
    }

    public static void main(String[] args) {
        System.out.println("--- Padrão Interpreter: Expressão Matemática ---");
        System.out.println("Expressão a ser avaliada: (5 + 10) * (20 / 4)");

        // 1. O Cliente monta (ou recebe de um Parser) a Árvore Sintática Abstrata (AST)
        Expression expression = buildExpression();

        // 2. O Cliente inicia a interpretação no nó raiz
        double result = expression.interpret();

        // 3. Resultado final
        System.out.println("\n--- Resultado Final ---");
        System.out.printf("O resultado da expressão é: %.2f%n", result); // Esperado: 15 * 5 = 75.00
    }

}