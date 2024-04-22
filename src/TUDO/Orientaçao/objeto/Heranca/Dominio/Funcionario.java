package TUDO.Orientaçao.objeto.Heranca.Dominio;

public class Funcionario extends Pessoa { // nao pode extender mais de uma classe
    // quando se fala de herença, vc sempre deve pensar, um funcionario É UMA PESSOA, logo, ele tem todos os atributos
    // de pessoa MAIS o de funcionario
    // evitar ao maximo usar herença, ja que oq vc fizer de modificaçao na classe Pessoa, vai ser modificado tbem nos seus extends

    // herenca nao funciona dentro de um metodo static
    private double salario;

    public Funcionario(String nome,String cpf){

        super(nome, cpf);




    }

    public void imprime(){ // eu quero executar tudo q tem no metodo pessoa MAIS oq vai ser executado agora nesse metodo

        super.imprime();               // sempre quando se fala de super, vc esta se referindo ao objeto extends, no caso, pessoa
        System.out.println(this.salario);

        // entao ele esta falando: executa o imprime do pessoa e depois executa o sout salario

    }

    public void relatorioPagamento(){

        System.out.println("Eu: " + this.nome + "recebi um salario de: " + this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
