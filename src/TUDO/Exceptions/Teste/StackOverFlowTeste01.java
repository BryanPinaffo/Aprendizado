package TUDO.Exceptions.Teste;

public class StackOverFlowTeste01 {
    public static void main(String[] args) {

        recursividade();
        recursividade02();


    }


    public static void recursividade() {


        recursividade();


    }

    public static void recursividade02() {


        recursividade02();


    }
}
