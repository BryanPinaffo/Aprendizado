package TUDO.Orientaçao.objeto.Metodos.Testes;

import TUDO.Orientaçao.objeto.Metodos.Dominio.Funcionario;
import TUDO.Orientaçao.objeto.Metodos.Dominio.FuncionarioTesteImpressora;

public class FuncionarioTeste01 {

    public static void main(String[] args) {

        Funcionario func01 = new Funcionario();

        Funcionario func02 = new Funcionario();

        Funcionario func03 = new Funcionario();


        Funcionario media = new Funcionario();
        FuncionarioTesteImpressora impressoraLegal = new FuncionarioTesteImpressora();

        func01.setNome("eu");
        func01.setIdade(21);
        func01.setSalarios(1600);

        func02.setNome("tu");
        func02.setIdade(26);
        func02.setSalarios(1100);

        func03.setNome("nois");
        func03.setIdade(29);
        func03.setSalarios(1900);

        impressoraLegal.imprime(func01);
        impressoraLegal.imprime(func02);
        impressoraLegal.imprime(func03);

        System.out.println("-----------------------------");
        System.out.println("sua media de salario é: ");
        media.salario(func01.getSalarios(), func02.getSalarios(), func03.getSalarios());





    }
}
