package TUDO.Orientaçao.objeto.Introduçao.test;

import TUDO.Orientaçao.objeto.Introduçao.Dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante(); // nomeia como um objeto
        Estudante estudante2 = new Estudante(); // nomeia como um objeto
        Estudante estudante3 = new Estudante(); // nomeia como um objeto
        // variavel de referencia do tipo estudante = objeto do tipo estudante

        //colocando valores em atributos

        estudante.idade = 21;
        estudante.nome = "Batata";
        estudante.sexo = 'M';

        estudante2.nome = "naosei";
        estudante2.idade = 32;
        estudante2.sexo = 'M';

        estudante3.nome = "oie";
        estudante3.idade = 65;
        estudante3.sexo = 'M';

        System.out.println(estudante.nome +'\n'+ estudante.idade+ '\n' + estudante.sexo+'\n');
        System.out.println(estudante2.nome +'\n'+ estudante2.idade+ '\n' + estudante2.sexo+'\n');
        System.out.println(estudante3.nome +'\n'+ estudante3.idade+ '\n' + estudante3.sexo+'\n');





    }
}
