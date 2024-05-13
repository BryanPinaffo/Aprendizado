package TUDO.Exceptions.Runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        abreConexao();
        System.out.println("---------------------");

        try {
            abreConexao2();
        }catch (RuntimeException e){

            System.out.println("deu ruim ai amigao");
        }

    }

    public static String abreConexao(){

        try{
            System.out.println("Abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
            return "conexao aberta";

        } catch (Exception e){

            e.printStackTrace();

        }
        finally {

            System.out.println("fechando o arquivo");

        }
        return null;


    }
    public static void abreConexao2() throws RuntimeException{

        try{
            System.out.println("Abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
            throw new RuntimeException();

        }
        finally {

            System.out.println("fechando o arquivo");

        }
        // nao é normalmente usado, bem raro, porem possivel.
        // usado em momentos bem especificos.

    }
}




