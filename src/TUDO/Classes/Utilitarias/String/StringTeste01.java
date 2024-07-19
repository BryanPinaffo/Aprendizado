package TUDO.Classes.Utilitarias.String;

public class StringTeste01 {

    public static void main(String[] args) {

        String nome = "Batata"; // string constant pool
        String nome2 = "Batata";
        // string sao imutaveis

        nome = nome.concat("Susane"); // concatanaçao, sempre tem que ser passado
        //mesmo que fazer: nome += "Susane"
        //precisa estar tomando cuidado quando se associa um novo valor a variavel de referencia

        System.out.println(nome == nome2); // Batata esta alocado no mesmo espaço em memoria para nome e nome2

        // quando existe dois nomes iguais, eles nao irao ter 2 espaços no string constant pool, mas sim apenas 1
        // que vai ser associado as duas variaveis.

    }

}
