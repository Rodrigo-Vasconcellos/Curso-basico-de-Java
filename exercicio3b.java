import java.util.Scanner;

public class exercicio3b {

    public static void main(String[] args) {
        System.out.println("digite 10 numeros: ");

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

/*forma de atribuir valores nos indices do array*/
        int contador = 0;
        for (contador = 0; contador < 10; contador++) {
            System.out.print("numero " + (contador + 1) + " : ");
            numeros[contador] = Integer.parseInt(entrada.nextLine());
        }

/*forma de ezibir o array*/
        System.out.printf("ordem narural do array    : ");
        System.out.printf("[");
        for (contador = 0; contador < 10; contador++) {
            if (contador == 9) {
                System.out.printf(" " + numeros[contador]);
            } else if (contador == 0) {
                System.out.printf(numeros[contador] + ",");
            } else {
                System.out.printf(" " + numeros[contador] + ",");
            }
        }
        System.out.printf("]");

/*logica para ordenar de forma crescente o array */
        int auxiliar = 0;
        for (int i = 0; i < 10; i++) {
            for (contador = 0; contador < 9; contador++) {
                if (numeros[contador] > numeros[contador + 1]) {
                    auxiliar = numeros[contador];
                    numeros[contador] = numeros[contador + 1];
                    numeros[contador + 1] = auxiliar;
                }
            }
        }

/*forma de ezibir o array*/
        System.out.println("");
        System.out.printf("ordenar de forma crescente: ");
        System.out.printf("[");
        for (contador = 0; contador < 10; contador++) {
            if (contador == 9) {
                System.out.printf(" " + numeros[contador]);
            } else if (contador == 0) {
                System.out.printf(numeros[contador] + ",");
            } else {
                System.out.printf(" " + numeros[contador] + ",");
            }
        }
        System.out.printf("]");

/*logica para ordenar de forma decrescente o array */
        auxiliar = 0;
        for (int i = 0; i < 10; i++) {
            for (contador = 0; contador < 9; contador++) {
                if (numeros[contador] < numeros[contador + 1]) {
                    auxiliar = numeros[contador];
                    numeros[contador] = numeros[contador + 1];
                    numeros[contador + 1] = auxiliar;
                }
            }
        }

/*forma de ezibir o array*/
        System.out.println("");
        System.out.printf("ordenar de forma decrescente: ");
        System.out.printf("[");
        for (contador = 0; contador < 10; contador++) {
            if (contador == 9) {
                System.out.printf(" " + numeros[contador]);
            } else if (contador == 0) {
                System.out.printf(numeros[contador] + ",");
            } else {
                System.out.printf(" " + numeros[contador] + ",");
            }
        }
        System.out.printf("]");


    }
}
