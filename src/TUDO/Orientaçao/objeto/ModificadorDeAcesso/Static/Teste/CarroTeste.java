package TUDO.Orientaçao.objeto.ModificadorDeAcesso.Static.Teste;

import TUDO.Orientaçao.objeto.ModificadorDeAcesso.Static.Dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro("BMW",280);
        Carro carro2 = new Carro("Ferrari",324);
        Carro carro3 = new Carro("Mercedes",320);

        Carro.setVelocidadeLimite(180);


        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();

    }

}
