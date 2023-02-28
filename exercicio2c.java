import java.util.Scanner;

public class exercicio2c {
    public static void main(String[] args) {
        int resposta = 0;
        System.out.printf("digite um numero: ");
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado = Integer.parseInt(entrada.nextLine());

        for (int i = 0; i < 11; i++) {
            resposta = i * numeroDigitado;
            System.out.println(i + " x " + numeroDigitado + " = " + resposta);
        }
    }
}
