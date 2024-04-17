package TUDO.Orientaçao.objeto.Metodos.Dominio;

import java.util.Arrays;

public class Calculadora {
    // metodo é responsavel por fazer uma açao e devolve-la
    // public void (nao devolve nada)
    // em seguida coloca o nome do metodo


    public void somaNumeros(){ // metodos sao executados no objeto
        System.out.println(10+10);
        System.out.println("PQP");


    }

    public void subtraiNumeros(){ // void nao tem return pq ele nao retorna nada, ele é um vazio, nao existe

        System.out.println(21-2);

    }

    public void multiplicaDoisNumeros(int num1, int num2){
        // oq fica dentro do parentesis é chamado de parametro, esses parametros sao variaveis locais
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros (double num1, double num2){
        double resultado;

        resultado = num1/num2;

        if (num1 == 0 || num2 == 0){

            return 0;
        }
        else {
            return resultado; // retorna um valor quando nao se usa o void
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        // ok, variaveis com valores dentro dos metodos nao podem ser alteradas
        // independente se tiverem outros valores fora do metodo, elas vao ser substituidas pelo valor dentro do metodo
        numero1 = 99;
        numero2 = 32;

        System.out.println("dentro do alteradoisnumeros ");
        System.out.println("num1 "+numero1);
        System.out.println("num2 "+numero2);

    }

    public void somaAarray (int[] numeros){

        int somar = 0;
        int soma = 0;
        int n = 0;


       for (int temp = 0; temp < numeros.length; temp++ ){

             soma = soma + numeros[n] ;
             n++;

       // for(int num : numeros){

            somar++;


        }
        System.out.println(somar);
        System.out.println(soma);





    }

    public void somaVarArgs(int...numeros){ // passa varios elementos do mesmo tipo


        int somar = 0;
        int soma = 0;
        int n = 0;

        for (int temp = 0; temp < numeros.length; temp++ ){

            soma = soma + numeros[n] ;
            n++;

            // for(int num : numeros){

            somar++;


        }
        System.out.println(somar);
        System.out.println(soma);



    }
}
