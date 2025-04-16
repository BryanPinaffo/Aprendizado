package TUDO.Classes.Utilitarias.IO;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("folderPasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("diretorio criado: " + isDiretorioCriado);


        File fileArquivoDiretorio = new File("C:\\Users\\bryan-pinaffo\\IdeaProjects\\Aprendizado\\folderPasta\\arquivo.txt");
        // criando um arquivo.tzt dentro do diretorio atraves do absolut path
        File fileArquivoDiretorio02 = new File(fileDiretorio, "arquivo02.txt");
        // criando um arquivo02.txt usando o proprio fileDiretorio e apenas falando quer arquivo criar


        try {
            boolean isFileCreate = fileArquivoDiretorio.createNewFile();
            System.out.println("o arquivo.txt foi criado? " + isFileCreate);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
