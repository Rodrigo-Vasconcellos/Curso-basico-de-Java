package senac;

public class operacoesMatematicas {

    public void somar (int numero1, int numero2) {
        int soma = numero1 + numero2;
        System.out.println("a soma de " + numero1 + " + " + numero2 + " = " + soma);
    }

    public void subtrair (int numero1, int numero2) {
        int subtracao = numero1 - numero2;
        System.out.println("a subtraçao de " + numero1 + " - " + numero2 + " = " + subtracao);
    }

    public void multiplicar (int numero1, int numero2) {
        int multiplicacao = numero1 * numero2;
        System.out.println("a multiplicaçao de " + numero1 + " * " + numero2 + " = " + multiplicacao);
    }

    public void dividir (int numero1, int numero2) {
        int divisao = numero1 / numero2;
        System.out.println("a divisao de " + numero1 + " / " + numero2 + " = " + divisao);
    }

}



