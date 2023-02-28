import java.util.Scanner;

public class exercicio2b {
    public static void main(String[] args) {
        System.out.printf("digite um numero inteiro: ");
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado = Integer.parseInt(entrada.nextLine());

        int fatorial = 0;
        System.out.printf(numeroDigitado + "!: ");
        for ( fatorial = 1; numeroDigitado > 1; numeroDigitado = numeroDigitado - 1) {
            System.out.printf(numeroDigitado + " x ");
            fatorial = fatorial * numeroDigitado;
        }

        System.out.printf( "1 =  " + fatorial );


    }
}
