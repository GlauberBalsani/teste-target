package com.balsani.teste05;

/**
 * 5) Escreva um programa que inverta os caracteres de um string.
 *
 *
 * IMPORTANTE:
 *
 * 	a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 *
 * 	b) Evite usar funções prontas, como, por exemplo, reverse;
 */

public class ReverseString {

    public static void main(String[] args) {

        String input =  "TARGET SISTEMAS";

        char[] string = input.toCharArray();

        System.out.println("String original: " + input);

        inverterString(string);

        String reversedString = new String(string);
        System.out.println("String invertida: " + reversedString);
    }

    public static void inverterString(char[] str) {
        int tamanho = str.length;
        int i, j;
        char temp;

        for(i = 0, j = tamanho - 1; i < j; i++, j--) {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }


}
