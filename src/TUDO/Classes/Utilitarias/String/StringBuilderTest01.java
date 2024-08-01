package TUDO.Classes.Utilitarias.String;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Bryan";
        nome.concat("Batata");
        nome = nome.substring(0,2);

        System.out.println(nome);

        StringBuilder sb = new StringBuilder();// existe duas coisas que pode colocar no (), uma delas sendo a capacidade(16) de caracteres
                                                // e a outra sendo a palavra

        sb.append("Bryan ").append("NoSei "); // serve como concat
        sb.insert(6,"Batata");
         String substring = sb.substring(0,2); // pega as primeiras 2 letras, porem como o substring retorna uma strimg, temos que criar uma string
         sb.reverse(); // resultado ao contrario
        sb.delete(0,2); // delete as posiçoes
        System.out.println(substring);
        System.out.println(sb);

    }
}
