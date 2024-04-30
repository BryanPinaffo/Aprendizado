package TUDO.Orientaçao.objeto.ClassesAbstratas.Teste;

import TUDO.Orientaçao.objeto.ClassesAbstratas.Dominio.Desenvolvedor;
import TUDO.Orientaçao.objeto.ClassesAbstratas.Dominio.Gerente;

public class Teste {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("YOUYOU",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Bryan",10000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);


    }
}
