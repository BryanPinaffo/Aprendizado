package TUDO.Orientaçao.objeto.LeituraDeDadosPeloConsole;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;

        System.out.println("Software de previsao do futuro");
        while ( i  < 5){
            System.out.println("digite sua pergunta e eu responderei sim ou nao");
            String pergunta = input.nextLine();
            if (pergunta.charAt(0) == ' ') {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
            i++;
        }
    }
}
