package exerciciosDeJavaIntrodutorios;

import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite 3 nueros");

        int i;
        double soma = 0;
        double media = 0;
        for(i=0;i<3;i++){
            double valor = Double.parseDouble(entrada.nextLine());
            soma = soma + valor;
        }
        media = soma / 3;
        System.out.println(media+" esta é a meia dos valores ");
    }
}
