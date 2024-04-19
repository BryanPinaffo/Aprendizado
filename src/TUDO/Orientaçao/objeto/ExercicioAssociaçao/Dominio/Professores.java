package TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio;

public class Professores {

    private String nome;
    private String especialidade;

    private Seminario [] seminario ;

    public Professores (String nome){

        this.nome = nome;
    }

    public void imprime(){

        System.out.println("seu nome é: " + nome);
        System.out.println("sua especialidade é: "+ especialidade);


            System.out.println("seminarios administrados" + seminario);

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = new Seminario[]{seminario};
    }
}
