package TUDO.Orientaçao.objeto.Associaçao.Bidirecional.DominioTime;

import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.Dominio.Jogador01;

public class Time01 {

    public String nome;
    private Jogador01 [] jogadores;

    public Time01(String nome){

        this.nome = nome;
    }

    public Time01(String nome, Jogador01[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){

        System.out.println(this.nome);
        System.out.println("jogadores: ");

        if(jogadores == null) return;

        for(Jogador01 jogador : jogadores){

            System.out.println(jogador.getNome());

        }

    }


    public Jogador01[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador01[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setNome (String nome){

        this.nome = nome;

    }

    public String getNome (){

        return this.nome;
    }

}
