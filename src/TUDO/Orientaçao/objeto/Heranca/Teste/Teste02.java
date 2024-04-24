package TUDO.Orientaçao.objeto.Heranca.Teste;

import TUDO.Orientaçao.objeto.Heranca.Dominio.Funcionario;

public class Teste02 {
    // 0- bloco de iniciaçizaçao estatico da super classe é executado quando a JVM carregar a classe mae
    // 1- bloco de iniciaçizaçao estatico da sub classe é executado quando a JVM carregar a classe filha
    // 2- alocado espaço em memoria pro objeto da classe mae
    // 3- cada atributo de classe é criado e inicializado com valores default ou oq for passado
    // 4- bloco de iniciaçizaçao da superclasse é executado na ordem em que aparece
    // 5- constutor é executado da superclasse

    // 6- alocado espaço em memoria pro objeto da subClasse
    // 7- cada atributo de classe é criado e inicializado com valores default ou oq for passado
    // 8- bloco de iniciaçizaçao da subclasse é executado na ordem em que aparece
    // 9- constutor é executado da subrclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("bryan","32423423");
    }
}
