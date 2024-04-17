package TUDO.Aprendizado.Inicial.Condicionais;

public class Condicionais {
    public static void main(String[] args) {
        int jogosFoda = 70;
        int jogosMerda = 90;
        if (jogosFoda < jogosMerda){
            System.out.println("vc precisa comprar mais jogos fodas");


        }

        else if (jogosFoda == jogosMerda){

            System.out.println("vc ainda precisa de mais jogos fodas");


        }
        else {
            System.out.println("meus parabens, vc tem muitos jogos bons");
        }

        // outro exercicio de condicional

        int idade = 18;
        int infantil = 15;
        int adulto = 18;
        String categoria;

        if(idade < infantil){

            categoria = "vc é da categoria infantil";
        }

        else if(idade >= infantil && idade < adulto ){
           categoria = "vc é da categoria juvenil";
        }

        else {

            categoria = "vc é da categoria adulto";
        }
        System.out.println(categoria);
    }
}
