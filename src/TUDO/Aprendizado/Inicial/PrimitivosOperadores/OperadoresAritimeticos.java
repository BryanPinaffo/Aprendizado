package TUDO.Aprendizado.Inicial.PrimitivosOperadores;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        //operadores aritimeticos, sao operadores que vc consegue realizar
        //matematica com os seus numeros. obvio, java é diferenciado
        // + - * / (soma, subtraçao, multiplicaçao e divisao)

        double number01 = 30.65D;
        double number02 = 60.356D;
        double number04 = 90.2312D;

        double soma = number01 + number02 + number04;
        double subtraçao = number01 - number02 - number04;
        double divisao = number01 / number02 / number04;
        double multiplicaçao = number01 * number02 * number04;
        double total = (soma + subtraçao + divisao + multiplicaçao) * 57;
        System.out.println(total);


        // OPERADORES RELACIONAIS
        // existe tambem o % que fornece o resto da divisao


        int resto = 20 % 2; // se for zero, par, se tiver numero, impar




        // padrao (< menor/ > maior / <= menor igual / >= maior igual / != diferente)


        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMaiorQueTrinta = 10<30;


        System.out.println(isDezMaiorQueTrinta+ " boolean");
        System.out.println(isDezMaiorQueVinte+ " boolean");




        // OPERADORES LOGICOS
        // && (E)  || (OR)
        // ! NOT

        int idade = 35;
        float salario = 4600F;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenor = idade < 30 && salario >= 3381;
        System.out.println("ele esta dentro da lei? " + isDentroDaLei);
        System.out.println("ele esta dentro da lei? " + isDentroDaLeiMenor);

        double contaCorrente = 200;
        double contapoupanca = 10000;
        double valorPs5 = 3500;
        boolean isCompravelPs5 = contaCorrente > valorPs5 || contapoupanca > valorPs5;

        System.out.println("ele é compravel? "+ isCompravelPs5);


        // operadores de atribuiçao
        // = ( igual) += -=  *= /= %= ( economiza um pouco de codigo)
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus += 1000;

        System.out.println(bonus);



        // por conta propia
        int contador = 0;

        while (contador <= 30 ) {

            System.out.println("numero: " + contador);
            contador ++; // isso é igual contador = contador + 1  e ele so funciona com 1
            break;
        }



    }
}
