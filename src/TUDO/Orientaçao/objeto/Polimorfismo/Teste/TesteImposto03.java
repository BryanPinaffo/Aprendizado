package TUDO.Orientaçao.objeto.Polimorfismo.Teste;

import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Computador;
import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Produto;
import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Tomate;
import TUDO.Orientaçao.objeto.Polimorfismo.Servico.CalculadoraImposto;

public class TesteImposto03 {

    public static void main(String[] args) {


        Produto produto = new Computador("ryzen 9", 3000);

        Tomate tomate = new Tomate("americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(produto);





    }


}
