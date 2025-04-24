package TUDO.Classes.Utilitarias.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        Path subfilePath = Paths.get("C:\\Users\\bryan-pinaffo\\IdeaProjects\\Aprendizado\\PastaTest\\subpasta\\subsubpasta","file.txt");
        if(Files.notExists(subfilePath)){

            Path filePathCreated = Files.createFile(subfilePath);

        }
    }
}
