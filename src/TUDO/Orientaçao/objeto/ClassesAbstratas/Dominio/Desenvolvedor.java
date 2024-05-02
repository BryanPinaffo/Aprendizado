package TUDO.Orientaçao.objeto.ClassesAbstratas.Dominio;

public class Desenvolvedor extends Funcionario {


    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void calculaBonus() {
        this.salario = salario + salario *0.1;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprime() {

    }
}
