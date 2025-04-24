package TUDO.Classes.Utilitarias.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyArquivo {
    public static void main(String[] args) throws IOException {

        Path copyArquivo = Paths.get("C:\\Users\\bryan-pinaffo\\IdeaProjects\\Aprendizado\\PastaTest\\subpasta\\subsubpasta","file.txt");

        Path source = copyArquivo;
        Path target = Paths.get(copyArquivo.getParent().toString(),"file_renamed.txt");
        // usamos o toString pq o Paths.get espera uma String e o getParent retorna um Path
        // podemos usar tbem o .resolve(), ele vai anexar um nome de arquivo ou subcaminho a um path
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        // source = origem
        // destino
        // StandardCopyOption.REPLACE_EXISTING = substitui o arquivo que ja existe, assim, evitando uma exception

    }
}
