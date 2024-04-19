package TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio;

public class Professores {

    private String nome;
    private String especialidade;

    private Seminarios[] seminario ;

    public Professores (String nome){

        this.nome = nome;
    }

    public void imprime(){

        System.out.println("seu nome é: " + nome);
        System.out.println("sua especialidade é: "+ especialidade);

        for(int i=0; i< seminario.length; i++) {
            System.out.println("seminarios administrados" + seminario);
        }

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminarios[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminarios[] seminario) {
        this.seminario = seminario;
    }
}
