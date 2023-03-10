package exerciciosDeJavaIntrodutorios;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite 2 numeros ");
        double n1 = Double.parseDouble(entrada.nextLine());
        double n2 = Double.parseDouble(entrada.nextLine());
        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double mutiplicar = n1 * n2;
        double dividir = n1 / n2;
        System.out.println("soma: "+soma +",subitraçao: "
                + subtracao+",multiplicaçao: "+ mutiplicar +
                ",dividir: "+dividir );
    }
}
