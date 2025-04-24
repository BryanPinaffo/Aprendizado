package TUDO.Classes.Utilitarias.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePastaAndSubPasta {
    public static void main(String[] args) {

        Path pastaPath = Paths.get("Pastas");
        Path subpastaPath = Paths.get("PastaTest/subpasta/subsubpasta");
        try {
            if(Files.exists(pastaPath)){

                pastaPath.toFile().renameTo(new File("PastasTest"));

            }
            else {
                Path pastaDirecotory = Files.createDirectory(pastaPath);
            }
            Files.createDirectories(subpastaPath); // consegue criar subpastas e nao lança exception


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
