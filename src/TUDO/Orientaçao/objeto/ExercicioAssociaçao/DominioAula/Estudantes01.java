package TUDO.Orientaçao.objeto.ExercicioAssociaçao.DominioAula;



public class Estudantes01 {

   private String nome;
    private int idade;
    private Seminario01 seminario;




    public Estudantes01(String nome,int idade){

        this.nome = nome;
        this.idade = idade;

    }

    public Seminario01 getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario01 seminario) {
        this.seminario = seminario;
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

}

