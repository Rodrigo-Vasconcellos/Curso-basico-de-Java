package senac;

import java.util.Scanner;

public class appOperacoesMatematica {

    public static void main(String[] args) {
        operacoesMatematicas operacoes = new operacoesMatematicas();

        System.out.println("digite 2 numeros: ");

        Scanner entrada = new Scanner(System.in);

        int numero1 = Integer.parseInt(entrada.nextLine());
        int numero2 = Integer.parseInt(entrada.nextLine());

        operacoes.somar(numero1, numero2);

        operacoes.subtrair(numero1, numero2);

        operacoes.multiplicar(numero1, numero2);

        operacoes.dividir(numero1, numero2);

    }
}
