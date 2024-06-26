package TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio;

import java.util.Arrays;

public class Seminario {

    private String titituloSeminario;

    private Local local;

    private Estudantes [] nome ;

    public String getTitituloSeminario() {
        return titituloSeminario;
    }

    public Seminario(String titituloSeminario){

        this.titituloSeminario = titituloSeminario;

    }

    public void imprime(){

        System.out.println("o titulo é: " + titituloSeminario);
        System.out.println("o endereço é: "+ local);
        System.out.println("os alunos sao: " + Arrays.toString(nome));


    }

    public String getLocal() {
        return local.toString();
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estudantes[] getAlunos() {
        return nome;
    }

    public void setNome(Estudantes[] nome) {
        this.nome = nome;
    }
}
