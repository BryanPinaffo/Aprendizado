package TUDO.Orientaçao.objeto.Polimorfismo.Servico;


import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Produto;
import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Tomate;


public abstract class CalculadoraImposto {
    public static void calcularImposto(Produto produto){

        System.out.println("Relatorio de imposto: ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("-----------------------------------");
        //deixamos mais generico para nao precisar criar varios metodos para cada produto

        if(produto instanceof Tomate) { // instanceof ve se o objeto existe (se instanciamos ele)
            // ele fala sobre produto instanceof tomate, pq quando vc chamar calcularImposto, vc vai colocar tomate
            // ao inves de produto, entao caso isso aconteceça, ele vai executar o if

            Tomate tomate = (Tomate) produto; // aqui ele esta falando que o produto tambem é um tomate
            System.out.println(tomate.getDataValidade());
        }


    }
}
