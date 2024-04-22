package TUDO.Orientaçao.objeto.ExercicioAssociaçao.TesteAula;

import TUDO.Orientaçao.objeto.ExercicioAssociaçao.DominioAula.Estudantes01;
import TUDO.Orientaçao.objeto.ExercicioAssociaçao.DominioAula.Local01;
import TUDO.Orientaçao.objeto.ExercicioAssociaçao.DominioAula.Professores01;
import TUDO.Orientaçao.objeto.ExercicioAssociaçao.DominioAula.Seminario01;

public class AssociacaoTeste {
    public static void main(String[] args) {

        Local01 local01 = new Local01("AV das pessoas");
        Estudantes01 aluno = new Estudantes01("Bryan",17);
        Professores01 professor = new Professores01("Batata","Chato");
        Estudantes01 [] estudanteParaSeminario = {aluno};
        Seminario01 seminario = new Seminario01("Onde esta o professor?",estudanteParaSeminario,local01);

        Seminario01 [] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();






    }
}
