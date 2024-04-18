package TUDO.Orientaçao.objeto.LeituraDeDadosPeloConsole;

import java.util.Scanner;

public class LeituraTeste01 {
    public static void main(String[] args) {

        String sexo01;

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome abaixo: ");
       String nome =  teclado.nextLine();

        System.out.println("digite sua idade");
        int idade = teclado.nextInt();

        System.out.println("digite M ou F para seu sexo");
        char sexo = teclado.next().charAt(0); // traz a primeira posiçao da palavra que foi convertida em um array (ja que se fala na posiçao zero)

        if(sexo =='M'){

             sexo01 = "Masculino";


        }
        else {

             sexo01 = "Feminino";

        }

        System.out.println("-------------------------");
        System.out.println("suas informaçoes: ");
        System.out.println("Nome:" + nome);
        System.out.println("idade"+ idade);
        System.out.println("sexo:" +sexo01 );
    }
}
