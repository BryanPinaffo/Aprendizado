package TUDO.Exceptions.Runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionMulti {
    public static void main(String[] args) {

        // quando mexemos com spring, temos protocolos que irao retornar exceptions como status
        // possuimos varios tipos de status (sao tipo erros, quando a pagina da erro, tipo ,error 400 ( parte do cliente, que tem algo errado))

        // nao se pode colocar o tipo mais generico na frente das especializadas, pq ele vai parar direto no generico.
        // tipo mais generico no final
       try{

            throw new RuntimeException();

        }
        catch (ArrayIndexOutOfBoundsException |IllegalArgumentException |ArithmeticException  e){

            System.out.println(" dentro do arrayIndex,IlegalArgument,Arithmatic");

        }

        catch (RuntimeException e){

            System.out.println("dentro do RuntimeException");
        }

        try {
            int documento = 0;
            int i = 1;

          int  z = i / documento;

            System.out.println(z);


        } catch (ArithmeticException e){

            System.out.println("jesus, funcionou");
            e.printStackTrace();

        }


    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}




