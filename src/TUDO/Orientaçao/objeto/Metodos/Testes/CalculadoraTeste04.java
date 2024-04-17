package TUDO.Orientaçao.objeto.Metodos.Testes;

import TUDO.Orientaçao.objeto.Metodos.Dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int [] numero = {5,5,5,5,5};

        calculadora.somaAarray(numero);

        calculadora.somaVarArgs(4,5,5,7,4,5,5);
    }
}
