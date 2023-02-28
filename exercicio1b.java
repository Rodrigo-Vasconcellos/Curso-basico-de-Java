import java.util.Scanner;

public class exercicio1b {
    public static void main(String[] args) {
        System.out.println("digite 1 numeros: ");
        Scanner entrada = new Scanner(System.in);


        int numero1Digitado = Integer.parseInt(entrada.nextLine());

        if ( numero1Digitado % 2 == 0){
            System.out.println(numero1Digitado + " numero par");
        }else {
            System.out.println(numero1Digitado + " numero impar");
        }
    }

}
