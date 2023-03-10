package exerciciosDeJavaIntrodutorios;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite uma temperatura em celsius: ");
        double temperatura = Double.parseDouble(entrada.nextLine());
        double fahrenheit = (temperatura * (9/5))+32;
        System.out.println(temperatura+" em celcius vale "+fahrenheit+" em fahrenheit");
    }
}
