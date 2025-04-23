package TUDO.Classes.Utilitarias.IO;

import java.io.File;
import java.io.IOException;

public class FileRename {
    public static void main(String[] args) {

        File absolutePath = new File("C:\\Users\\bryan-pinaffo\\IdeaProjects\\Aprendizado\\folderPasta");
        File diretorioRenamed = new File("Pasta");

        File fileCreted = new File(absolutePath,"arquivotest.txt");
        File fileRenamed = new File(absolutePath,"arquivoRenomeado.txt");

        try {
            boolean isFileCreted = fileCreted.createNewFile();
            System.out.println("o arquivo foi criado?" + isFileCreted);

            boolean isRenamed = fileCreted.renameTo(fileRenamed);
            System.out.println("arquivo foi renomeado? "+isRenamed);

            boolean isRenamedDiretorio = absolutePath.renameTo(diretorioRenamed);
            System.out.println("a pasta foi renomeada?" + isRenamedDiretorio);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
