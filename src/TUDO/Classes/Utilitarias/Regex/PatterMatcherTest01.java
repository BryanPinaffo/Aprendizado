package TUDO.Classes.Utilitarias.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {
    //expressoes regulares: uma linguagem desenvolvida que usa simbolos, e se fizer errado da muita merda
    // ele vai encontrar padroes no texto

    // por exenplo, vc tem toda a ficha de varios funcionarios, e vc quer apenas os emails deles, a expressao regular vai fazer isso acontecer

    // é usado para validaçoes, ele vai fazer que vc escreva um email valido, por exemplo

    public static void main(String[] args) {

        String regex = "aba";
       // String texto = "abaaaaba";
        String texto = "abababa";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posiçoes encontradas");

        // matcher vai ficar procurando durante o texto

        while (matcher.find()){

            System.out.print(matcher.start() + " ");
        }

        // o matcher nao faz ele reconhecer os 3 "aba" q tem ai, pq ele ja conta do 1 ao 3 como 1 aba. fazendo com q ele ignore esses 3
        // e procure pelo proximo


    }
}
