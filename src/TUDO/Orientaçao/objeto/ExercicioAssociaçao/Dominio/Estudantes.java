package TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio;

public class Estudantes {

   private String nome;
    private int idade;

    private String seminario;


    public Estudantes(String nome){

        this.nome = nome;

    }

    public void imprime(){

        System.out.println("nome do aluno: "+ nome);
        System.out.println("sua idade: " + idade);
        System.out.println("nome do seminario: "+ seminario);


    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSeminario() {
        return seminario;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }

}

