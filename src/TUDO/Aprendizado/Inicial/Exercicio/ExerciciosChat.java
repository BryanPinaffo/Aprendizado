package TUDO.Aprendizado.Inicial.Exercicio;
import java.util.Scanner;

public class ExerciciosChat {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double number1;
        double number2;
        int respostaOperadores;
        double calculo;


        System.out.println("digite o primeiro numero ");
        number1 = entrada.nextDouble();

        System.out.println("digite o segundo numero ");
        number2 = entrada.nextDouble();

        System.out.println("qual operador vc vai usar? \n "+" 1-soma \n "+" 2-subtraçao \n "+" 3- multiplicaçao \n "+ " 4- divisao \n ");

        respostaOperadores = entrada.nextInt();

        if (respostaOperadores == 1) {
            calculo = number1 + number2;
            System.out.println("a resposta do calculo é " + calculo);
        }
        else if(respostaOperadores == 2){
            calculo = number1 - number2;
            System.out.println("a resposta do calculo é " + calculo);
        }
        else if(respostaOperadores == 3){
            calculo = number1 * number2;
            System.out.println("a resposta do calculo é " + calculo);
        }
        else if (respostaOperadores == 4 ) {
            calculo = number1 / number2;
            System.out.println("a resposta do calculo é " + calculo);
        }
        else {
            System.out.println("erro");

        }







    }
}
