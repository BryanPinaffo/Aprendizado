package TUDO.Aprendizado.Inicial.Exercicio;

public class ExercicioRepetiçao {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 ate 1 milhao

        int conta = 0;

        while (conta <= 1000000){

            int calculo = conta % 2;
            if (calculo == 0 ) {

                System.out.println( conta + " par");
            }

            else{

                System.out.println( conta + " impar");
            }
            conta ++;
        }

        for(conta = 0; conta<= 1000000;conta++){

            int calculo = conta % 2;

            if (calculo == 0 ) {

                System.out.println( conta + " par");
            }

            else{

                System.out.println( conta + " impar");
            }

        }
    }
}
