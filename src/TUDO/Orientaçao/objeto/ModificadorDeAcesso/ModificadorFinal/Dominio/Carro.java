package TUDO.Orientaçao.objeto.ModificadorDeAcesso.ModificadorFinal.Dominio;

public class Carro {
    // se colocar o final na classe, ela nao podera ser extendida

    private String nome;
    private final static double VELOCIDADE_LIMITE = 200; // Final é uma constante, ela vai ser criado e ficar naquela forma ate que alguem
                                                // altere ela no codigo, um valor fixo, nao mutavel
                                                // escrita em Letra MAIUSCULA E COM UNDERLINE

    public final Comprador COMPRADOR = new Comprador(); // a referencia que essa variavel tem para esse objeto nunca vai ser alterado
    // ele criou uma variavel que faz referencia a classe comprador, onde possui nome, essa referencia nao pode ser mudada
    // e nem associada com mais ninguem
    // porem os dados entre objetos podem ser alterados


    public final void imprime(){ // o metodo nunca podera ser sobrescrito

        System.out.println(this.nome);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "velicidade limite" +
                "do carro: " + VELOCIDADE_LIMITE;
    }
}
