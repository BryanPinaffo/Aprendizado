package TUDO.Orientaçao.objeto.Metodos.Testes;

import TUDO.Orientaçao.objeto.Metodos.Dominio.Calculadora;

public class CalculadoraTeste03 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int[] numeros = {10,20,30,40,50,660,70,80,90,0};
        calculadora.somaAarray(numeros);

    }


}
