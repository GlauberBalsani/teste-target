package com.balsani.teste02;

/**
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o
 * próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci
 * e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 * IMPORTANTE:
 * <p>
 * Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */
public class Fibonacci {
    public static void main(String[] args) {
        int num = 55;
        int a = 0;
        int b = 1;

        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        if (a == num) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }


}
