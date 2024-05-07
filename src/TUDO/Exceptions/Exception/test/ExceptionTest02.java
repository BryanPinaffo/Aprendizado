package TUDO.Exceptions.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();


    }

    public static void criarNovoArquivo() throws IOException { // quando lança esse throws, quem chamar esse metodo é obrigado a tratar esse problema

        // metodos privados sao mais propensos a usar try catch
        // porem se for publico, entao seria bom usar o throws, pois isso depende de quem vai chamar e de como ele vai querer tratar o exception

        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado " + isCriado);
        } catch (IOException e) {

            System.out.println("o arquivo nao foi criado corretamente");
            e.printStackTrace(); // exibe no console a excessao
            throw e; // exibe tbem
        }


    }
}
