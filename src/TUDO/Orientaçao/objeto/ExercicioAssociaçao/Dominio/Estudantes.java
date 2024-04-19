package TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio;

public class Estudantes {

   private String nome;
    private int idade;

    private Seminario seminario;


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

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

}

