package TUDO.Orientaçao.objeto.Metodos.Testes;

import TUDO.Orientaçao.objeto.Metodos.Dominio.EstudantesMetodos;
import TUDO.Orientaçao.objeto.Metodos.Dominio.ImprimeEstudante;

public class EstudantesMetodosTeste01 {

    public static void main(String[] args) {

        EstudantesMetodos estudantes01 = new EstudantesMetodos();
        EstudantesMetodos estudantes02 = new EstudantesMetodos();
        // podemos fazer varias referencias (estudante01 e afins) para o mesmo objeto, nao possui limites

        ImprimeEstudante impressora = new ImprimeEstudante();

        estudantes01.nome = "eu";

        estudantes01.idade = 20;

        estudantes01.sexo = 'M';


        estudantes02.nome = "GiovanaL";

        estudantes02.idade = 20;

        estudantes02.sexo = 'F';

        impressora.imprime(estudantes01);
        // aqui esta passando oq o objeto esta guardado, no caso do q ele esta escrito ( nessa caso é o sout)
        // e o entre parenteses vc esta passando uma referencia do q quer que ele use
        // nesse caso ele vai substituir os valores ja existentes pelo valor estudantes01 em todas variaveis em comum

        impressora.imprime(estudantes02);
        //tbem existe o parametro tipo referencia, onde podemos colocar um parametro dentro de um metodo,
        // fazendo que ele substitua todos os outros, tipo,
        // colocar no metodo ImprimeEstudantes " estudantes.nome = "bryan"", todos que foram chaamdo com estudantes.nome, serao mudados para bryan





    }

}
