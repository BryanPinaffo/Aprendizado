package TUDO.Orientaçao.objeto.ExercicioAssociaçao.DominioAula;



public class Professores01 {

    private String nome;
    private String especialidade;
    private Seminario01 [] seminarios;


    public Professores01(String nome, String especialidade){

        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores01 (String nome, String especialidade, Seminario01 [] seminarios){

        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;

    }

    public void imprime(){

        System.out.println("---------");
        System.out.println("Professor: "+ this.nome);
        System.out.println("especialidade: "+ this.especialidade);
        System.out.println("---------");


        if(seminarios == null) {
            return;
        }
        else {

            System.out.println("##Seminarios cadastrados## ");

            for(Seminario01 semina : seminarios){

                System.out.println("titulo: " + semina.getTitituloSeminario());
                System.out.println("endereço: "+ semina.getLocal01().getEndereco());

                if(semina.getEstudantes01s() == null || semina.getEstudantes01s().length == 0){

                    continue;
                }
                else {
                    for(Estudantes01 aluno : semina.getEstudantes01s()) {

                        System.out.println("**Alunos**");

                        System.out.println("Aluno: " + aluno.getNome());
                        System.out.println("idade: " + aluno.getIdade());
                    }

                }

            }

        }



    }

    public Seminario01[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario01[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
