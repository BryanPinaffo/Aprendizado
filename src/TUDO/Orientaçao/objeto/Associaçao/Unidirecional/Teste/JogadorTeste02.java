package TUDO.Orientaçao.objeto.Associaçao.Unidirecional.Teste;

import TUDO.Orientaçao.objeto.Associaçao.Inicio.Dominio.Jogador;
import TUDO.Orientaçao.objeto.Associaçao.Unidirecional.Dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Time timeJogador = new Time("NaoSei");

        jogador1.setTime(timeJogador);

        jogador1.imprime();

    }
}
