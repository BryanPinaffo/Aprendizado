package TUDO.Orientaçao.objeto.Associaçao.Unidirecional02.Teste;

import TUDO.Orientaçao.objeto.Associaçao.Unidirecional02.Dominio.Escola;
import TUDO.Orientaçao.objeto.Associaçao.Unidirecional02.Dominio.Professor;

public class TesteEscola {

    public static void main(String[] args) {

        Professor professor = new Professor("Bryan");
        Professor professor01 = new Professor("Batata");
        Professor professor02 = new Professor("Batinha");
        Professor professor03 = new Professor("quando");
        Professor professor04 = new Professor("Nasce");
        Professor professor05 = new Professor("esparrama");
        Professor professor06 = new Professor("pelo");
        Professor professor07 = new Professor("chao");
        Professor [] professores = {professor,professor01,professor02,professor03,professor04,professor05,professor06,professor07};

        Escola escola = new Escola("NaoSei",professores);

        escola.imprime();
    }
}
