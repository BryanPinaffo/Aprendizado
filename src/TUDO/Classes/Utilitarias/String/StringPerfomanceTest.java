package TUDO.Classes.Utilitarias.String;

public class StringPerfomanceTest {
    public static void main(String[] args) {

        double inicio = System.currentTimeMillis(); // pega o tempo atual do sistema em milissegundos
        concatString(1000000); // executa o metodo
        double fim = System.currentTimeMillis(); // pega o tempo atual tbem em milissegundos

         double diferença = fim - inicio;
        // quando vc faz o inicio menos o fim, da o tempo que demorou para a execuçao do metodo

        double segundos = diferença / 1000;

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
}
