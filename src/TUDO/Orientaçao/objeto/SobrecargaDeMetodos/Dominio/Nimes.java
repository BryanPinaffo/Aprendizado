package TUDO.Orientaçao.objeto.SobrecargaDeMetodos.Dominio;

public class Nimes {

    private String nome;

    private String tipo;

    private int episodios;

    private String genero;

    public void init(String nome, String tipo, int episodios){

        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }
    public void init(String nome, String tipo, int episodios, String genero){

        this.init(nome,tipo,episodios); // isso faz ele puxar os parametros do outro metodo de forma mais facil para nao repetir linha
        this.genero = genero;

    }

    public void imprime(){
        System.out.println("Anime: "+ this.nome);
        System.out.println("quantidade de epsodios: "+this.episodios);
        System.out.println("tipo: "+this.tipo);
        System.out.println("genero: "+ this.genero);
    }

    public void setTipo(String tipo){

        this.tipo = tipo;
    }

    public String getTipo(){

        return this.tipo;
    }
    public void setEpisodios(int episodios){

        this.episodios = episodios;
    }
    public int getEpisodios(){

        return this.episodios;
    }
    public void setNome(String nome){

        this.nome = nome;
    }

    public String getNome(){

        return this.nome;
    }

    public void setGenero(String genero){

        this.genero = genero;
    }
    public String getGenero(){

        return this.genero;
    }

}
