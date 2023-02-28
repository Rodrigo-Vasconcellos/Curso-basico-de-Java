package senac;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        System.out.println("digite um numero inteiro:");
        Scanner entrada = new Scanner(System.in);
        String valorDigitado = entrada.nextLine();
        int numeroDigitado = Integer.parseInt(valorDigitado);
        if (numeroDigitado % 2 == 0) {
            System.out.println(numeroDigitado + "eh par");
        } else {
            System.out.println(numeroDigitado + "eh impar");
        }
    }



}
