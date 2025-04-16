package TUDO.Classes.Utilitarias.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//File - o arquivo em si
//FileWriter - para escrever o arquivo / nao é otimizado
//FileReader - para ler o arquivo / nao é otimizado
//BufferWriter - escreve o arquivo de forma mais otimizada
//BufferReader - le o arquivo de forma mais otimizada

public class FileWriter01 {


    public static void main(String[] args) {


        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true)) {

            fw.write("sao 11h da manha e eu to morrendo de sono\n vou continuar com o sono o dia todo mesmo dormindo por 7h");
            fw.flush(); // força a escrita dos dados que estao no buffer (area temporaria da memoria)

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
