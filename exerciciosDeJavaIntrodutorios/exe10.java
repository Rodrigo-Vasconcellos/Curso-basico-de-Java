package exerciciosDeJavaIntrodutorios;

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um texto");
        String texto = entrada.nextLine();
        String[] palavras = texto.split("\\s+");
        System.out.println("quntidade: " + palavras.length);
    }
}
