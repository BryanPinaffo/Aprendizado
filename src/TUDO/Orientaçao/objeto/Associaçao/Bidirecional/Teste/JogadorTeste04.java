package TUDO.Orientaçao.objeto.Associaçao.Bidirecional.Teste;

import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.Dominio.Jogador01;
import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.DominioTime.Time01;

public class JogadorTeste04 {
    public static void main(String[] args) {

        Jogador01 jogador = new Jogador01("Cafu");
        Jogador01 jogador02 = new Jogador01("Batata");
        Time01 time = new Time01("Brasil");

        Jogador01 [] jogadores = {jogador,jogador02};

        jogador.setTime(time);
        jogador02.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-----jogador-----------");

        jogador.imprime();

        System.out.println("-----jogador02-----------");

        jogador02.imprime();

        System.out.println("-----Time-----------");
        time.imprime();
    }
}
