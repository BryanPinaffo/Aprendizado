package TUDO.Orientaçao.objeto.SobrecargaDeMetodos.Teste;

import TUDO.Orientaçao.objeto.SobrecargaDeMetodos.Dominio.Nimes;

public class TesteNimes {
    public static void main(String[] args) {

        Nimes anime =  new Nimes();

        anime.init("one piece","TV",12, "açao");

        anime.imprime();



    }
}
