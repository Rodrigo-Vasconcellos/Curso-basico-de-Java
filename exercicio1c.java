import java.util.Scanner;

public class exercicio1c {

    public static void main(String[] args) {
        System.out.printf("digite um ano:  ");
        Scanner entrada = new Scanner(System.in);

        int anoDigitado = Integer.parseInt(entrada.nextLine());

        if ((anoDigitado % 4 == 0 && anoDigitado % 100 != 0) || (anoDigitado % 400 == 0)) {
            System.out.println(anoDigitado +" é um ano bissexto "  );
        }else {
            System.out.println("não deu bom " + anoDigitado);
        }

    }
}
