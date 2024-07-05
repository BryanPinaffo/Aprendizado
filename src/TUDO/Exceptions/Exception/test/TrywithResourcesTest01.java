package TUDO.Exceptions.Exception.test;

import java.io.*;

public class TrywithResourcesTest01 {

    public static void main(String[] args) {
        lerArquivo();

    }


    public static void lerArquivo() {

        Reader reader = null; // reader trabalha com leituras de arquivos

        try {
            reader = new BufferedReader(new FileReader("C:\\senhas e problemas\\desativarconta.txt"));

            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void lerArquivo2(){
        try( Reader reader = new BufferedReader(new FileReader("C:\\senhas e problemas\\desativarconta.txt"));){

            // esse tipo de try, chamado de try com recursos,
            // ele é apenas usados em classes onde tem a implementaçao do Readable, Closeable
            // onde o closeable ira herdar o AutoCloseble
            // permitindo que ele se feche sozinho, fazendo uso do try com recursos

            // é possivel tbem colocar um try sem o catch, usando apenas o throw
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
