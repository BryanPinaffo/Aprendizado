package TUDO.Orientaçao.objeto.ModificadorDeAcesso.ModificadorFinal.Teste;

import TUDO.Orientaçao.objeto.ModificadorDeAcesso.ModificadorFinal.Dominio.Carro;
import TUDO.Orientaçao.objeto.ModificadorDeAcesso.ModificadorFinal.Dominio.Comprador;
import TUDO.Orientaçao.objeto.ModificadorDeAcesso.ModificadorFinal.Dominio.Ferrari;

public class Teste {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Comprador comprador2 = new Comprador(); // eu nao preciso de comprador2 para pegar tudo oq tem na classe Comprador
                                                // posso usar o mesmo objeto carro para pegar tudo

        //carro.COMPRADOR = comprador2; NAO PODE PQ ELE SO FAZ REFERENCIA A Comprador NAO AO OBJETO

        System.out.println(carro);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("ola"); // classe carro entra com COMPRADOR e pega o setNome para alterar o valor
                                        // estamos bloqueando apenas a referencia, nao oq tem dentro dela
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrarinho");
        ferrari.imprime();

    }

}
