package senac;

import java.util.Scanner;

public class exercicio4b {

    public static void main(String[] args) {
        System.out.println("digite 10 numeros inteiros:");

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i = 0; i < 10; i++){
            numeros[i] = Integer.parseInt(entrada.nextLine());
        }

        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }

        int media = soma / numeros.length;
        System.out.println("soma dos valores: " + soma);
        System.out.println("media dos valores: " + media);

    }
}
