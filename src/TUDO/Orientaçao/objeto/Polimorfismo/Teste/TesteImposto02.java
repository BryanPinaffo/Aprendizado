package TUDO.Orientaçao.objeto.Polimorfismo.Teste;

import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Computador;
import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Produto;
import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Tomate;

public class TesteImposto02 {

    public static void main(String[] args) {

        // issso so funciona quando possui herença
        // isso pq todos os atributos que temos na superClasse podem ser chamados na subclasse, pq vai ser herdado


        Produto produto = new Computador("ryzen 9", 3000); // quem executa é sempre o objeto
        // um tipo mais generico ( produto), fazendo referencia a um tipo mais especifico ( computador)

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("--------------------------");

        Produto produto2 = new Tomate("americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("--------------------------");

        // estamos usando o mesmo tipo de variavel de referencia para dois tipos de objeto



    }


}
