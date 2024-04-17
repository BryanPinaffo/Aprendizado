package TUDO.Aprendizado.Inicial.Array;

public class VetoresArrays {
    public static void main(String[] args) {
        // declaramos um array, porem nao criamos ele ainda

        // int [] idade = null;

       // podemos usar nulo tbem, nulo significa que existe mas nao faz referencia a nada
        // STRING USA NULL (NULO)

        int [] idade = new int[3]; // criando um array int onde ele via possuir 3 quadrados ou espaços para alocar memoria
            // indice sempre começa com 0, igual python

        idade[0] = 20;
        idade[1] = 19;
        idade[2] = 18;


       // System.out.println( "as idades sao " + idade[0] +" "+ idade[1] +" "+ idade[2]);

        // valores de inicializaçao dos arrays
        // byte, short, int, long, float e double = VALOR 0
        //char = ' \ u000' (unicode)
        //boolean = false
        //string = null



        String [] nomes = new String[11];

        nomes [0] = "eu_nao_sei";
        nomes [1] = "eu_nao_se";
        nomes [2] = "eu_nao_s";
        nomes [3] = "eu_nao_";
        nomes [4] = "eu_nao";
        nomes [5] = "eu_na";
        nomes [6] = "eu_n";
        nomes [7] = "eu_";
        nomes [8] = "eu";
        nomes [9] = "e";
        nomes [10] = "_";


        for (int i = 0 ; i < nomes.length ; i++){  // LENGTH MOSTRA O SEU TAMANHO, ASSIM FACILITANDO A MUDANÇA DE TAMANHO DO ARRAY


            System.out.println(nomes[i]);


        }












    }
}
