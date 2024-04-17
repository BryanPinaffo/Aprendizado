package TUDO.Orientaçao.objeto.Associaçao.Bidirecional.Dominio;

import TUDO.Orientaçao.objeto.Associaçao.Bidirecional.DominioTime.Time01;
import TUDO.Orientaçao.objeto.Associaçao.Unidirecional.Dominio.Time;

public class Jogador01 {

    private String nome;
    private Time01 time;


    public Jogador01(String nome) {

        this.nome = nome;
    }


    public void setTime(Time01 time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {

        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }

    }
}
