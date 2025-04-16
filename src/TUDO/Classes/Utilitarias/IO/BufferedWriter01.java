package TUDO.Classes.Utilitarias.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) {

        // muito parecido com a FileWriter

        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw))  {

            bw.write("sao 11h da manha e eu to morrendo de sono vou continuar com o sono o dia todo mesmo dormindo por 7h");
            bw.newLine(); // pula linha, ao inves de usar o \n igual se usa no file
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }



        // Basicamente, ele vai colocar em memoria para depois salvar no disco, ao inves de salvar diretamente no disco
        // FileWriter (salva em disco)
        //BufferedWriter (salva em memoria)
    }
}
