package TUDO.Orientaçao.objeto.Heranca.Teste;

import TUDO.Orientaçao.objeto.Heranca.Dominio.Endereco;
import TUDO.Orientaçao.objeto.Heranca.Dominio.Funcionario;
import TUDO.Orientaçao.objeto.Heranca.Dominio.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua das maldivas");
        endereco.setCep("846551415");

        Pessoa pessoa = new Pessoa("Bryan Verza Pinaffo","4774818469");
        System.out.println("---------div---------");

        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("batata","345345");
        System.out.println("---------div---------");


        funcionario.setEndereco(endereco);
        funcionario.setSalario(424.4);

        funcionario.imprime();


    }
}
