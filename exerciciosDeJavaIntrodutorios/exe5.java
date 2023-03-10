package exerciciosDeJavaIntrodutorios;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o raio do circulo ");
        float raioDoCirdulo = Float.parseFloat(entrada.nextLine());
        float areaDoCirculo = 3.14f * (raioDoCirdulo * raioDoCirdulo);
        System.out.println("a area do circulo: " + areaDoCirculo);
    }
}
