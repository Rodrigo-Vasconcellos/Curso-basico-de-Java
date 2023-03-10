package exerciciosDeJavaIntrodutorios;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        //criar o objeto entrada
        Scanner entrada = new Scanner(System.in);

        System.out.printf("digite seu nome: ");

        String nome = entrada.nextLine();

        System.out.printf("Olá, " + nome);
    }
}
