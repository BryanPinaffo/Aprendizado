package TUDO.Orientaçao.objeto.Introduçao.test;

import TUDO.Orientaçao.objeto.Introduçao.Dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "um ai";
        professor.idade = 32;
        professor.sexo='M';

        System.out.println(professor.nome +'\n' + professor.idade +'\n'+ professor.sexo+'\n');

    }
}
