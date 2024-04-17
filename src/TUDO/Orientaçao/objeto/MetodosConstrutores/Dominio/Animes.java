package TUDO.Orientaçao.objeto.MetodosConstrutores.Dominio;

public class Animes {
    private String nome;

    private String tipo;

    private int episodios;

    private String genero;

    private String estudio;


    // nao possui retorno ( como void, int, double)
    // vantagem: te forçam a seguir regras, por exemplo:
    //  obrigatoriamente vc precisa de um nome para criar esse anime
    // o construtor é executado antes de qualquer metodo que vc tem na sua classe

    public Animes(String nome, String tipo, String genero, int episodios){
        this(); // esse this so pode ser usado nessa forma dentro de um contrutor
        // p this chamando outro contrutor DEVE ser a primeira linha executavel

        this.nome = nome;

        this.tipo = tipo;

        this.genero = genero;

        this.episodios = episodios;


    }

    // construtor é um inicializador dos objetos e se vc colocar certos parametros para ele,
    // vc obrigadoriamente deve seguir esses parametros


    // o construtor pode ter sobrecarga de metodo
    public Animes(String nome, String tipo, String genero, int episodios, String estudio){
        this(nome, tipo, genero, episodios); // nao precisa colocar um .nomedometodo, pq ele é o contrutor,
                                            // apenas colocando o this ja é o suficente

        this.estudio = estudio;

    }

    public Animes(){

        System.out.println("dentro de um construtor sem argumentos");
    }


    public void unit(String nome, String tipo, String genero, int episodios) {

        this.nome = nome;

        this.tipo = tipo;

        this.genero = genero;

        this.episodios = episodios;

    }

    public void imprimir() {

        System.out.println("nome do anime: " + this.nome);
        System.out.println("tipo do anime: " + this.tipo);
        System.out.println("genero do anime: " + this.genero);
        System.out.println("quantidade de episodios: " + this.episodios);
        System.out.println("o estudio é: "+ this.estudio);
    }

}
