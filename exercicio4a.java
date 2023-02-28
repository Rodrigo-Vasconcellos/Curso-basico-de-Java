package senac;

import java.util.ArrayList;
import java.util.Scanner;


public class exercicio4a {

    public static void main(String[] args) {

        System.out.printf("digite 2 numeros: ");

        Scanner entrada = new Scanner(System.in);

        int numero1 = Integer.parseInt(entrada.nextLine());
        int numero2 = Integer.parseInt(entrada.nextLine());

        int resposta = numero1 + numero2;
        System.out.printf("a soma de " + numero1 + " + " + numero2 + " = " + resposta);
    }
}
