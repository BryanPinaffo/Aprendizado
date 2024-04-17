package TUDO.Orientaçao.objeto.Associaçao.Bidirecional.Teste;

import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.Dominio.Jogador01;
import TUDO.Orientaçao.objeto.Associaçao.Inicio.Dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {

        Jogador01 jogador01 = new Jogador01("Pelé");
        Jogador01 jogador02 = new Jogador01("Romario");
        Jogador01 jogador03 = new Jogador01("Cafu");

        Jogador01[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador01 jogador : jogadores) { // Jogador criou variavel chamada jogador : percorre jogadores

            jogador.imprime();
        }
    }
}
