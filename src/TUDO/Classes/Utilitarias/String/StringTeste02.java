package TUDO.Classes.Utilitarias.String;

public class StringTeste02 {

    public static void main(String[] args) {

        String nome = "    Luffy   ";
        String numeros = "012345";


        System.out.println(nome.charAt(4)); // mostra a palavra que esta na posiçao 4
        System.out.println(nome.length()); // mostra quantos caracteres tem
        System.out.println(nome.replace("f","l")); // replace troca uma letra pela outra
        System.out.println(nome.toLowerCase()); // tudo em minusculo
        System.out.println(nome.toUpperCase()); // tudo em maiusculo
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,3)); // primeiro indice começa com zero, o segundo indice começa com 1
        // substring vai criar uma string que começa onde o primeiro indice foi informado e vai até onde segundo indice informa.
        System.out.println(nome.trim()); // remove os espaços
    }



}
