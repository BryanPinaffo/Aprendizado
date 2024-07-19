package TUDO.Classes.Utilitarias.String;

import java.util.Scanner;

public class MeuTeste {
    public static void main(String[] args) {

        textoNaoSei();




    }

    private static void textoNaoSei(){

        Scanner scam = new Scanner(System.in);

        System.out.println("escreve a palavra a seguir o mais rapido possivel");
        System.out.println("  ");

       System.out.println("digite um numero");
       int valor = scam.nextInt();
       scam.nextLine();
        String palavraSorteada = sorteio(valor);
        System.out.println("podemos começar?");
        String determinacao = scam.nextLine().toLowerCase();
        if(determinacao.equals("sim")){
            double inicio = System.currentTimeMillis();
            System.out.println(palavraSorteada);
            String rapido = scam.nextLine();
            double fim = System.currentTimeMillis();

            double tempo = fim - inicio;
            double segundos = tempo / 1000;

            if( rapido.equals(palavraSorteada)) {

                System.out.println("vc levou " + segundos + "s");
                scam.close();
            }

            else {

                System.out.println("vc errou, tenta novamente");
                scam.close();

            }

        }

        else {

            System.out.println("ok");
            scam.close();
        }



    }

    private static String sorteio(int valor){



        String [] aleatorio = new String[15];
        aleatorio [0] = "Batata";
        aleatorio [1] = "Balaústre";
        aleatorio [2] = "Beneplácito";
        aleatorio [3] = "Deletério";
        aleatorio [4] = "Desasnado";
        aleatorio [5] = "Empedernido";
        aleatorio [6] = "Hebdomadário";
        aleatorio [7] = "Horrípilo";
        aleatorio [8] = "Iconoclasta";
        aleatorio [9] = "Idiossincrasia";
        aleatorio [10] = "Inócuo";
        aleatorio [11] = "Jocoso";
        aleatorio [12] = "Juvenilizante";
        aleatorio [13] = "Kafkaesco";
        aleatorio [14] = "Lancinante";

        int indice = valor % aleatorio.length;

        String doideira = aleatorio[indice];

        return doideira;

    }
}
