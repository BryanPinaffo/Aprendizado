package TUDO.Orientaçao.objeto.BlocosDeInicializaçao.Teste;

import TUDO.Orientaçao.objeto.BlocosDeInicializaçao.Dominio.AnimeEstatico;

public class TesteAnimeEstatico {

    public static void main(String[] args) {

        AnimeEstatico animeEstatico = new AnimeEstatico();

        System.out.println(animeEstatico.getNome());

        for( int episodio: animeEstatico.getEpisodios()){

            System.out.println(episodio + " \n");

        }

        AnimeEstatico anime01 = new AnimeEstatico();
        AnimeEstatico anime02 = new AnimeEstatico();
        AnimeEstatico anime03 = new AnimeEstatico();

    }

}
