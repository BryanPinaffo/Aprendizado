package TUDO.Orientaçao.objeto.Polimorfismo.Servico;

import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Computador;
import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Tomate;

public abstract class CalculadoraImposto {

    public static  void calcularImpostoComputador(Computador computador){

        System.out.println("Relatorio de imposto do computador:\n ");
        System.out.println(computador);

        double imposto = computador.calcularImposto();
        double valor = computador.getValor() + imposto;
        System.out.println("preço do imposto: " + imposto);
        System.out.println(imposto);
        System.out.println("novo valor:" + valor);
        System.out.println("-------------------------------------");


    }
    public static void calcularImpostoTomate(Tomate tomate){

        System.out.println("Relatorio de imposto do tomate: \n");
        System.out.println(tomate);

        double imposto = tomate.calcularImposto();
        double valor = tomate.getValor() + imposto;
        System.out.println("preço do imposto: " + imposto);
        System.out.println("novo valor:" + valor);
        System.out.println("-------------------------------------");

    }
}
