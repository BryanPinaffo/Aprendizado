package TUDO.Orientaçao.objeto.ClassesAbstratas.Dominio;

public abstract class Funcionario { // classes abstratas veio para resolver um problema de escrita de codigo/ design
                                    // abstract é uma classe que tem que ser extendida, ja que ela nao pode ser instanciada

    protected String nome;
    protected  double salario;

    public  Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


}
