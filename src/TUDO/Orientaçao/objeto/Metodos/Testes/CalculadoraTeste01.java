package TUDO.Orientaçao.objeto.Metodos.Testes;

import TUDO.Orientaçao.objeto.Metodos.Dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaNumeros(); // para chamar um metodo é o class.metodo()

        calculadora.subtraiNumeros();

        calculadora.multiplicaDoisNumeros(10,29); // ele vai pedir os valores para poder executar

        calculadora.divideDoisNumeros(20,2);

        System.out.println(calculadora.divideDoisNumeros(32,32));
        // pode fazer assim ou colocar dentro de uma variavel double





    }
}
