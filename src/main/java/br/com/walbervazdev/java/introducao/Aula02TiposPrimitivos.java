package br.com.walbervazdev.java.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos");
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000L;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = 10;
        short ageShort = 10;
        long bigNumber = 100000L;
        char character = 'A';
        boolean isTrue = true;

        // String is not a primitive type in Java - String is a class reference type
        String name = "Walber Vaz";

        System.out.println("int: " + age);
        System.out.println("double: " + salaryDouble);
        System.out.println("float: " + salaryFloat);
        System.out.println("byte: " + ageByte);
        System.out.println("short: " + ageShort);
        System.out.println("long: " + bigNumber);
        System.out.println("char: " + character);
        System.out.println("boolean: " + isTrue);
        System.out.println("Nome é (String): " + name);
    }
}
