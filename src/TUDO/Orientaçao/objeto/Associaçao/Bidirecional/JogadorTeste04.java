package TUDO.Orientaçao.objeto.Associaçao.Bidirecional;

import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.Dominio.Jogador01;
import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.DominioTime.Time01;

public class JogadorTeste04 {
    public static void main(String[] args) {

        Jogador01 jogador = new Jogador01("Cafu");
        Time01 time = new Time01("Brasil");

        Jogador01 [] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-----jogador-----------");

        jogador.imprime();

        System.out.println("-----Time-----------");
        time.imprime();
    }
}
