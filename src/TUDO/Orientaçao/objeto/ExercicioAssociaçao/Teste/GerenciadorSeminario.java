package TUDO.Orientaçao.objeto.ExercicioAssociaçao.Teste;

import TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio.Estudantes;
import TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio.Local;
import TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio.Professores;
import TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio.Seminarios;

public class GerenciadorSeminario {

    public static void main(String[] args) {

        Estudantes aluno = new Estudantes("Bryan");
        Estudantes aluno02 = new Estudantes("Bryan");
        Professores professor = new Professores("PROFESSORDAHORA");
        Seminarios seminario = new Seminarios("O SEMINARIO");
        Seminarios seminario02 = new Seminarios("O SEMINARISTA");
        Local local = new Local("AV jose das flores");

        Estudantes[] alunos = {aluno,aluno02};

        Seminarios[] semina = {seminario,seminario02};

        aluno.setSeminario(" O SEMINARIO PREMIADO");
        aluno.setIdade(20);

        professor.setEspecialidade("CHATO");
        professor.setSeminario(semina);

        seminario.setNome(alunos);

        System.out.println("----------------ALUNO---------------");
        aluno.imprime();
        System.out.println("----------------PROFESSOR---------------");
        professor.imprime();
        System.out.println("----------------SEMINARIO---------------");
        seminario.imprime();
        System.out.println("----------------SEMINARIO02---------------");
        seminario02.imprime();




    }


}
