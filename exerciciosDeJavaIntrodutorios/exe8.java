package exerciciosDeJavaIntrodutorios;

import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite 1 ano ");
        double ano = Double.parseDouble(entrada.nextLine());
        if( (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println(ano +" ano bixesto");
        } else {
            System.out.println(ano +" nao é ano bixesto");
        }
    }
}
