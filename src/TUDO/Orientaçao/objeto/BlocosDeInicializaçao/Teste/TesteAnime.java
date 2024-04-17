package TUDO.Orientaçao.objeto.BlocosDeInicializaçao.Teste;

import TUDO.Orientaçao.objeto.BlocosDeInicializaçao.Dominio.Anime;

public class TesteAnime {
    public static void main(String[] args) {

        Anime anime = new Anime("one piece");

        for ( int episodio : anime.getEpisodios()){

            System.out.println(episodio + " ");
        }


        //anime.imprimir();




    }
}
