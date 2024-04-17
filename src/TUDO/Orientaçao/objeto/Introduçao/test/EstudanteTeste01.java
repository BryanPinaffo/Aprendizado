package TUDO.Orientaçao.objeto.Introduçao.test;

import TUDO.Orientaçao.objeto.Introduçao.Dominio.Estudante;

public class EstudanteTeste01
{

    public static void main(String[] args) {

        Estudante estudante = new Estudante();


        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
