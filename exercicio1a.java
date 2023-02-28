package senac;

import java.util.Scanner;

public class exercicio1a {

    public static void main(String[] args) {
        System.out.println("digite 2 numeros: ");
        Scanner entrada = new Scanner(System.in);


        int numero1Digitado = Integer.parseInt(entrada.nextLine());
        int numero2Digitado = Integer.parseInt(entrada.nextLine());


        if (numero1Digitado > numero2Digitado) {
            System.out.println("o valor " +numero1Digitado+ " é maior" );

        } else {
            System.out.println("o valor " +numero2Digitado+ " é maior" );
        }
    }
}
