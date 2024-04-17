package TUDO.Orientaçao.objeto.BlocosDeInicializaçao.Dominio;

public class Anime {
    private String nome;

    private int[] episodios;

      {
        // bloco de iniciaçizaçao
        // pode ser colocado em qualquer lugar do codigo
        // porem recomendado antes do construtor

        System.out.println("dentro do bloco de inicializaçao");

        // 1- alocado espaço em memoria pro objeto
          // 2- cada atributo de classe é criado e inicializado com valores default ou a que for passada
          // 3- bloco de inicializaçao é executado
          // 4- construtor é executado

          episodios = new int[100];

          for (int i = 0; i < episodios.length ; i++) {

              episodios[i] = i+1;


          }
     }


    public Anime(String nome){

        this.nome = nome;


    }


    public Anime(){




        for( int episodio : this.episodios){

            System.out.println(episodio +" ");
        }
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }

    /*public void imprimir(){

        System.out.println("nome: "+ getNome());
        System.out.println("episodio: "+ getEpisodios());


    }*/


 }




