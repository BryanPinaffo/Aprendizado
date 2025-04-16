package TUDO.Classes.Utilitarias.IO;

import java.io.*;

public class BufferedReader01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while ((linha = br.readLine()) != null){

                System.out.println(linha);

            }
            //br.readLine(); // vai ler uma linha inteira


        } catch (IOException e) {
            e.printStackTrace();

        }

        //segue o mesmo padrão, o mesmo raciocínio

    }
}
