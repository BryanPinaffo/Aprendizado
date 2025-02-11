package TUDO.Classes.Utilitarias.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        //meta caracteres:
        // \d = todos os digitos(numeros) daquele texto
        // \D = tudo oq nao for digito
        // \s = espaços em branco ( \t, \n, \f, \r )
        // \S = todos os caracters excluindo os em branco
        // \w = a-z,A-Z, digitos, _
        // \W = tudo oq nao for incluso no \w

        String regex = "\\W"; // sempre pra dar um contra barra, precisamos colocar +1, para servir como um caracter de escape
        String texto = "f3498f398h9@jf3jfn fnfj340903jfmfc3hf9#384fm423809jfm wfmnfgklfç309f´_q34f8im";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posiçoes encontradas");

        while (matcher.find()){

            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }


    }
}
