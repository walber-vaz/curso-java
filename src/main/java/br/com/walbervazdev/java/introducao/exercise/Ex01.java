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
        String nome = "Walber Vaz";
        String endereco = "Trv 1, 123";
        double salario = 1000.00;
        String dataRecebimento = "12/08/2023";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco
                + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento);
    }
}
