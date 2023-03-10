package manipulacaoDeString;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um texto");
        var texto = entrada.nextLine();

        String textoInvertido = new StringBuilder(texto).reverse().toString();
        System.out.println(textoInvertido);
    }
}

