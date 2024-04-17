package TUDO.Orientaçao.objeto.Metodos.Dominio;

public class Funcionario {

     private String nome;

     private int idade;
     private double salarios;
     private double media ;


        public void salario(double salarios01, double salarios02, double salarios03) {

            media = (salarios01 + salarios02 + salarios03) / 3;

            System.out.println(media);

        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarios() {
        return salarios;
    }

    public void setSalarios(double salarios) {
        this.salarios = salarios;
    }
}








