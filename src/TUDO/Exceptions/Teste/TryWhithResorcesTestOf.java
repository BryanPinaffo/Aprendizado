package TUDO.Exceptions.Teste;

import TUDO.Exceptions.Dominio.Leitor1;
import TUDO.Exceptions.Dominio.Leitor2;

import java.io.IOException;

public class TryWhithResorcesTestOf {
    public static void main(String[] args) {

        try {
            leitorArquivo();
        } catch (IOException e) {

        }

    }

    public static void leitorArquivo() throws IOException {

        try(Leitor1 leitor = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }



    }
}
