package TUDO.Orientaçao.objeto.ModificadorDeAcesso.Privado.Teste;

import TUDO.Orientaçao.objeto.ModificadorDeAcesso.Privado.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) { // acoplamento = o quao uma classe esta conectada com a outra

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("batata");
        pessoa.setIdade(11);

        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());








    }
    // modificador de acesso privado : esses atributos so serao acessados pelo objeto,
    // ele so funciona dentro do objeto(dentro da classe), falando em outras palavras


}
