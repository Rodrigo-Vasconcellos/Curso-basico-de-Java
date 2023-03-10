package exerciciosDeJavaIntrodutorios;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero inteiro: ");
        int numeroInteiro = Integer.parseInt(entrada.nextLine());

        if(numeroInteiro > 0){
            System.out.println("valor " + numeroInteiro + " é positivo");
        } else if (numeroInteiro < 0){
            System.out.println("valor " + numeroInteiro + " negativo");
        } else {
            System.out.println("valor " + numeroInteiro + "é zero");
        }
    }
}

