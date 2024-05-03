package TUDO.Orientaçao.objeto.Polimorfismo.Teste;

import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Computador;
import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Tomate;
import TUDO.Orientaçao.objeto.Polimorfismo.Servico.CalculadoraImposto;

public class TesteImposto {
    public static void main(String[] args) {

        Computador computador = new Computador("TI-Bryan",2000);
        Tomate tomate = new Tomate("TOMATAO",100);

        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
