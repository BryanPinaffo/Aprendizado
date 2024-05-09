package TUDO.Exceptions.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();


    }

    private static void criarNovoArquivo()  {

        int documento = 0;
        int i = 1;


        while ( documento < i){

            String nomeDoArquivo = "arquivo\\teste" + i +".txt";

            File file = new File(nomeDoArquivo);

            try {
                boolean isCriado = file.createNewFile();
                System.out.println("arquivo criado " + isCriado);
            } catch (IOException e) { // sempre pegar as excessoes mais especificas

                System.out.println("o arquivo nao foi criado corretamente");
                e.printStackTrace();

            }

            if (file.delete()){

                System.out.println("deletado");
            }
            i++;
        }




    }
}
