package TUDO.Orientaçao.objeto.Associaçao.Inicio.teste;

import TUDO.Orientaçao.objeto.Associaçao.Inicio.Dominio.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romario");
        Jogador jogador03 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) { // Jogador criou variavel chamada jogador : percorre jogadores

            jogador.imprime();
        }
    }
}
