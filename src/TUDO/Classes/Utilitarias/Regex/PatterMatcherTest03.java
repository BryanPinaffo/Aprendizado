package TUDO.Classes.Utilitarias.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest03 {
    public static void main(String[] args) {
        //meta caracteres:
        // [] consegue selecionar os caracteres que vc quer pegar

       // String regex = "[1-9 A-Z]"; // abcABC

        // quantificadores = sao caracteres que e dao poder em pegar determinada expressao baseado na quantidade de caracteres:

        // ? zero ou uma
        // zero ou mais
        // + uma ou mais
        //{n,m} de n até m
        //() agrupamento
        // | OU ex: o(v/c)o = ovo / oco
        // $ representa o fim da linha
        //. ex: 1.3 tudo que possa ter entre o 1 e o 3 ex: 1@3, 1e3


        String regex ="0[xX]([0-9 a-f A-F])+(\\s|$)"; // é sempre um OU, x ou X

        String texto = "120X0X0XFFSc BC0X4538940c X10XADB CFO0ABD A213481 0x10G 0x1 ";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posiçoes encontradas");

        while (matcher.find()){

            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        //int numeroHex = 0X453894; // fazer o java ler um numero exadecimal, só precisa colocar o 0X na frente, sem espaço
        //System.out.println(numeroHex);


    }
}
