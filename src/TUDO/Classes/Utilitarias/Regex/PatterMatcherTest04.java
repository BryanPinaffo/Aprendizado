package TUDO.Classes.Utilitarias.Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest04 {
    public static void main(String[] args) {


        // quantificadores = sao caracteres que e dao poder em pegar determinada expressao baseado na quantidade de caracteres:

        //. ex: 1.3 tudo que possa ter entre o 1 e o 3 ex: 1@3, 1e3


        String regex ="([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // caracter de escape, entao quer dizer que isso vc quer dizer literalmente o ., nao o . quantificador

        String texto = "luffy@gmail.com, 3456@hotmail.com, teste@gmail.com, sakura@gmail,!@#zoro@gmail.br";

        System.out.println("!@#zoro@gmail.br".matches(regex)); // .matches, ele faz uma verificaçao se ele bate com a expressao regular
       // System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[3].trim()); // trim tira os espaços
        //fala que vc quer q quebre o texto por virgula (o split)

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
