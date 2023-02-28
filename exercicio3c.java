import java.util.Scanner;

public class exercicio3c {
    public static void main(String[] args) {
        System.out.println("digite numeros para preencher a matriz 3/3: ");

        Scanner entrada = new Scanner(System.in);
        int[][] numeros = new int[3][3];

/*forma de atribuir valores nos índices de um matriz*/
        for(int i = 0; i < 3; i++) {
            for(int j = 0;j < 3; j++){
                numeros[i][j] = Integer.parseInt(entrada.nextLine());
            }
        }
/*forma de exibir matriz*/
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("posiçao (" + i + "," + j + ") = " + numeros[i][j]);
            }
        }

/*logica para encontrar o maior numero na matriz*/
        int maior= 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (maior < numeros[i][j]){
                    maior = numeros[i][j];
                }
            }
        }
        System.out.println("o maior numero digitado foi: " + maior );
    }
}
