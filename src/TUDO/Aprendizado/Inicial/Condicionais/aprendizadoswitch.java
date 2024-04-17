package TUDO.Aprendizado.Inicial.Condicionais;

public class aprendizadoswitch {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando o 1 como domingo

        byte dia = 10;
        // valores que vc pode colcar no switch
        // char, int, byte, short, enum, string
        switch (dia) {

            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;

            default:
                System.out.println("erro");
                break;

        }


    }
}
