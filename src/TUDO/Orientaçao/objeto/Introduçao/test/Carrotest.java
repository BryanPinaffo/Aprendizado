package TUDO.Orientaçao.objeto.Introduçao.test;

import TUDO.Orientaçao.objeto.Introduçao.Dominio.Carro;

public class Carrotest {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "carrinhoDoSaoMiguel";
        carro.modelo = "naoTenhoIdeia";
        carro.ano = 2012;

        carro1.nome = "carrinhoMeuAmigo";
        carro1.modelo = "naoTenhoIdeiaDeModelos";
        carro1.ano = 5487;

        System.out.println("Nome: "+carro.nome +'\n'+"Modelo: "+ carro.modelo +'\n'+"Ano: "+ carro.ano+'\n');
        System.out.println("Nome: "+carro1.nome +'\n'+"Modelo: "+ carro1.modelo +'\n'+"Ano: "+ carro1.ano+'\n');
    }

}
