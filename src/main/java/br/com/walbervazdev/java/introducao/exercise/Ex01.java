package br.com.walbervazdev.java.introducao.exercise;

/**
 * Exercício 01
 * 
 * Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * 
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data
 * <data>
 */

public class Ex01 {
    public static void main(String[] args) {
        String name = "Walber Vaz";
        String address = "Trv 1, 123";
        double salary = 1000.00;
        String receivingDate = "12/08/2023";

        System.out.println("Eu " + name + ", morando no endereço " + address
                + ", confirmo que recebi o salário de " + salary + ", na data " + receivingDate);
    }
}
