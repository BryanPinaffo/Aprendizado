package TUDO.Classes.Utilitarias.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {

        Path dir = Paths.get("home/bryan");
        Path arquivo = Paths.get("arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve); // resolve vai juntar os Paths

        Path absoluto = Paths.get("/home");
        Path relativo = Paths.get("bryan");
        Path file = Paths.get("arquivo.txt");
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + file.resolve(relativo));


    }
}
