package TUDO.Orientaçao.objeto.Metodos.Testes;

import TUDO.Orientaçao.objeto.Metodos.Dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 1;

        int num2 = 2;

        calculadora.alteraDoisNumeros(num1,num2);

        System.out.println("dentroDoCalculadoraTeste");

        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
