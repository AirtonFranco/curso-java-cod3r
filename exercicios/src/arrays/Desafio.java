package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas? ");

        int qtdNotas = entrada.nextInt();
        System.out.println(qtdNotas);

        entrada.close();
    }
}