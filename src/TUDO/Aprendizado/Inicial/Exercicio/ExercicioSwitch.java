package TUDO.Aprendizado.Inicial.Exercicio;

public class ExercicioSwitch {
    public static void main(String[] args) {

        int dia = 5;
        switch (dia){

            case 1:
                System.out.println("Domingo, final de semana");
                break;

            case 2:
                System.out.println("Segunda. dia de semana");
                break;

            case 3:
                System.out.println("terça, dia de semana");
                break;

            case 4:
                System.out.println("quarta, dia de semana");
                break;

            case 5:
                System.out.println("quinta, dia de semana");
                break;

            case 6:
                System.out.println("sexta, dia de semana");
                break;

            case 7:
                System.out.println("sabado, final de semana");
                break;

            default:
                System.out.println("erro");
                break;
        }
    }
}
