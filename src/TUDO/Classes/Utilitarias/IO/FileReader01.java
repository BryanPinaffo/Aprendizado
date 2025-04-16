package TUDO.Classes.Utilitarias.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
    public static void main(String[] args) {

        FileWriter01 fw01 = new FileWriter01();

        File file= new File("file.txt");

        try(FileReader fr = new FileReader(file)) {
            /* char[] in = new char[1]; // pega a primeira posição
            System.out.println(fr.read(in)); // mostra o numero no AsciiTable do primeiro caracter

            for(char c : in){ // faz o c percorrer in

                System.out.print(c); // retorna apenas a posiçao 1, pq era tudo q o in tinha

            }*/

            int i;
            while ((i = fr.read()) !=  -1){ // o i primeiro vai receber fr(caracter por caracter), depois ele vai se repetir até dar -1 (q seria o final do texto)

                System.out.print((char) i);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
