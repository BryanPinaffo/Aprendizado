package TUDO.Orientaçao.objeto.ExercicioAssociaçao.DominioAula;


public class Seminario01 {

    private String titituloSeminario;

    private Estudantes01 [] estudantes01s;
    private Local01 local01 ;


    public Seminario01(String titituloSeminario,Local01 local01){

        this.titituloSeminario = titituloSeminario;
        this.local01 = local01;

    }

    public Seminario01(String titituloSeminario, Estudantes01[] estudantes01s, Local01 local01) {
        this.titituloSeminario = titituloSeminario;
        this.estudantes01s = estudantes01s;
        this.local01 = local01;
    }

    public Local01 getLocal01() {
        return local01;
    }


    public Estudantes01[] getEstudantes01s() {
        return estudantes01s;
    }


    public String getTitituloSeminario() {
        return titituloSeminario;
    }

}
