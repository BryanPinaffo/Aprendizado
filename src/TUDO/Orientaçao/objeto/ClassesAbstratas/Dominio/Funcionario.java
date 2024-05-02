package TUDO.Orientaçao.objeto.ClassesAbstratas.Dominio;

public abstract class Funcionario extends Pessoa { // classes abstratas veio para resolver um problema de escrita de codigo/ design
                                    // abstract é uma classe que tem que ser extendida, ja que ela nao pode ser instanciada
                                    // metodos abstratos so podem existir dentro de classes abstratas
                                    // porem classes abstratas podem possuir metodos nao abstratos

                                    // se uma classe abstrata estiver herdando outra classe abstrata, ela nao precisa implementar
                                    // os metodos, porem suas filhas irao precisar.

                                    // ou vc pode acrescentar tudo no metodo abstrato que esta herdando, para as filhas nao precisarem
                                    // herdar tbem

    protected String nome;
    protected  double salario;

    public  Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();



}
