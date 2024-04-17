package TUDO.Orientaçao.objeto.BlocosDeInicializaçao.Dominio;

public class AnimeEstatico {
    public String nome;
    public static int [] episodios ;

    // bloco de inicializaçao é executado quando a JVM carregar a classe
    // se tiver mais de 1 bloco de inicializaçao estatico, ele vai ser executado na ordem, apenas 1 vez
    // bloco de inicializaçao é executado toda vez que um objeto é criado, fazendo assim ele se repetir muitas vezes
    // sendo apropriado um modo static


   static  {

        System.out.println("dentro do bloco de inicializaçao");
        episodios = new int [1000];

        for (int i = 0; i < episodios.length; i++ ){

            episodios[i] = i+1; // para começar a lista no 1 e nao no zero

        }


    }





    public AnimeEstatico(String nome){

        this.nome = nome;
    }


    public AnimeEstatico(){

        System.out.println("coloca um nome");


    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
