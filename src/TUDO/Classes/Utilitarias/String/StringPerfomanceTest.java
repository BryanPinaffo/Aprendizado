package TUDO.Classes.Utilitarias.String;

public class StringPerfomanceTest {
    public static void main(String[] args) {

        double inicio = System.currentTimeMillis(); // pega o tempo atual do sistema em milissegundos
        concatString(10000); // executa o metodo
        double fim = System.currentTimeMillis(); // pega o tempo atual tbem em milissegundos
         double diferença = fim - inicio;
        // quando vc faz o inicio menos o fim, da o tempo que demorou para a execuçao do metodo
         double segundos = diferença / 1000;

        System.out.println("tempo gasto para String " + diferença + "ms");
        System.out.println("em segundos: " + segundos + "s");



         inicio = System.currentTimeMillis();

         concatStringBuilder(10000000);

        fim = System.currentTimeMillis();

         diferença = fim - inicio;

         segundos = diferença / 1000;

        System.out.println("tempo gasto para String " + diferença + "ms");
        System.out.println("em segundos: " + segundos + "s");



        inicio = System.currentTimeMillis();

         concatStringBuffer(10000000);

        fim = System.currentTimeMillis();

         diferença = fim - inicio;

         segundos = diferença / 1000;

        System.out.println("tempo gasto para String " + diferença + "ms");
        System.out.println("em segundos: " + segundos + "s");


    }
    private static void concatString (int tamanho){

        String texto = "";

        for(int i = 0; i < tamanho ; i++){

            texto += i; // como string sao imutaveis, ele vai adcionar dessa forma: 0,01,012,0123,01234
                        // e assim por diante
        }

    }
    private static void concatStringBuilder (int tamanho){

        StringBuilder sb = new StringBuilder(tamanho);
        /* stringbuilder manipula sequencia de caracteres com facilidade e sem ficar criando
            novas strings no string pool o tempo todo, alem disso é possivel manipular ela com facilidade.
            usando, sb.append, sb.delete, sb.insert e sb.replace

            ex:       sb.insert(5, "amigo ");
           ele vai adicionar no caracter 5 a palavra amigo

         */

        for(int i = 0; i < tamanho ; i++){

            sb.append(i);

        }

    }
    private static void concatStringBuffer (int tamanho){

        StringBuffer sb = new StringBuffer(tamanho);
        // a mesma coisa do string builder, porem apenas uma thread pode acessar ela por vez
        // vou aprender sobre threads mais pra frente

        for(int i = 0; i < tamanho ; i++){

            sb.append(i);

        }

        // recomendado a usar Stringbuilder ou StringBuffer quando tiver muitas strings e concatenação.

    }
}
