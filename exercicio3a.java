package senac;

import java.util.Scanner;

public class exercicio3a {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite 10 numeros: ");
        int contador = 0;
        int[] numeros = new int[10];
        while (contador < 10) {

            System.out.print("numero " + (contador+1)  + " : ");
            numeros[contador] = Integer.parseInt(entrada.nextLine());

            contador++;
        }
        contador = 0;
        int maior = Integer.MIN_VALUE;
        while (contador < numeros.length) {
            if(maior < numeros[contador] ){
                maior = numeros[contador];
            }
            contador++;

        }
        System.out.println("o maior numero: " + maior);
    }

}
