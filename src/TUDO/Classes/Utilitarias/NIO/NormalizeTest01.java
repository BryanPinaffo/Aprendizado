package TUDO.Classes.Utilitarias.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {

        String diretorioProjto = "home/bryan";
        String arquivoTxt = "../../arquivo.txt"; // ../../ =  voltar duas pastas
        Path path1 = Paths.get(diretorioProjto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./bryan");
        System.out.println(path2);
        System.out.println(path2.normalize());




    }
}
