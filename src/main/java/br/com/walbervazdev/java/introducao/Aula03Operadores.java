package br.com.walbervazdev.java.introducao;

public class Aula03Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        int number1 = 10;
        int number2 = 20;

        // Soma
        System.out
                .println("Soma entre " + number1 + " e " + number2 + " é: " + (number1 + number2));

        // Subtração
        System.out.println(
                "Subtração entre " + number1 + " e " + number2 + " é: " + (number1 - number2));

        // Multiplicação
        System.out.println(
                "Multiplicação entre " + number1 + " e " + number2 + " é: " + (number1 * number2));

        // Divisão
        System.out.println(
                "Divisão entre " + number1 + " e " + number2 + " é: " + (number1 / number2));

        // Resto da divisão
        System.out.println("Resto da divisão entre " + number1 + " e " + number2 + " é: "
                + (number1 % number2));
    }
}
