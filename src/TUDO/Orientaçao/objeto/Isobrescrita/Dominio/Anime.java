package TUDO.Orientaçao.objeto.Isobrescrita.Dominio;

public class Anime extends Object {
    private String nome;

    public String toString(){ // a funçao dele é retornar um objeto String

        return this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
