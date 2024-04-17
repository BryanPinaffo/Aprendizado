package TUDO.Orientaçao.objeto.Associaçao.Bidirecional.TesteTime;

import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.Dominio.Jogador01;
import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.DominioTime.Time01;

public class JogadorTesteTime03 {
    public static void main(String[] args) {

        Jogador01 jogador1 = new Jogador01("Pelé");
        Time01 timeJogador = new Time01("NaoSei");

        jogador1.setTime(timeJogador);

        jogador1.imprime();

    }
}
