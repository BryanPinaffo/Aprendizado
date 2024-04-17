package TUDO.Aprendizado.Inicial.Exercicio;
import java.util.Scanner;

public class ExerciciosChat02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numerosPrimos;
        int calculos;

        System.out.println("digite um numero");
        numerosPrimos = entrada.nextInt();

        calculos = numerosPrimos % 2;

        if (numerosPrimos == 2){
            System.out.println("seu numero é primo");
         }

        else if (calculos == 0){
            System.out.println("seu numero nao é primo");
         }

        else {
            System.out.println("seu numero é primo");
         }


    }
}
