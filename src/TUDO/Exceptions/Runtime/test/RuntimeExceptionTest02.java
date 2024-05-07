package TUDO.Exceptions.Runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {


        try {
            divisao(1,0);

        }
        catch (RuntimeException e){

            e.printStackTrace(); // mostra o tipo de erro mas continua executando o codigo

        }
        System.out.println("codigo finalizado");

    }

    private static int divisao(int a, int b) throws IllegalArgumentException{ // esse throws serve para avisar as outras pessoas sobre o tratamento do metodo
        if( b == 0){
            throw new IllegalArgumentException("argumento ilegal, nao pode ser zero"); // é para mostrar o erro para quem for mexer
            // throw new, quando vc quer lançar uma excessao
            // quando usado, nao precisa colocar throws no metodo para ter como aviso, isso apenas para RunTimeException
        }

        return a/b;

    }



}
