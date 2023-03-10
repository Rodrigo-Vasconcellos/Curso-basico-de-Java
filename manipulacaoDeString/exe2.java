package manipulacaoDeString;

import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um texto");
        var texto = entrada.nextLine().toLowerCase();
        var quantidadeVogais = 0;

        var vogais = Set.of('a', 'e', 'i', 'o', 'u') ;

        for (int i = 0; i <texto.length(); i++ ){
            var c = texto.charAt(i);
            if (vogais.contains(c)) {
                quantidadeVogais++;
            }
        }
        System.out.println(quantidadeVogais);
    }
}
