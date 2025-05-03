package TUDO.Classes.Utilitarias.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvePath {
    public static void main(String[] args) {

        Path dir = Paths.get("home/bryan");
        Path arquio = Paths.get("bryan/arquivo.txt");
        Path resolve = dir.resolve(arquio);
        System.out.println(resolve); // resolve vai juntar os Paths

        Path absoluto = Paths.get("/home");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("arquivo.txt");
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(file));
        System.out.println("4 " + file.resolve(file));


    }
}
