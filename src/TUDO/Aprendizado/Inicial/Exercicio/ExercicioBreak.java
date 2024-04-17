package TUDO.Aprendizado.Inicial.Exercicio;

public class ExercicioBreak {
    public static void main(String[] args) {
        double valorCarro = 73500;
        int parcelas = 1;
        double calculoParcela;

        do {
            calculoParcela = valorCarro / parcelas;

            if(calculoParcela < 1000){
                break;

            }

            System.out.println("numero de parcelas " + parcelas + " valor de parcelas " + calculoParcela);

            parcelas++;



        }
        while (calculoParcela > 1000);



    }
}
