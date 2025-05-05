package TUDO.Classes.Utilitarias.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {

        Path dir = Paths.get("/home/bryan");
        Path clazz = Paths.get("/home/bryan/negocioDeLouco/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz); // ele calcula e mostra oq falta para ir de um path até outro
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/bryan");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/bryan/negocioDeLouco/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2025505");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + absoluto2.relativize(absoluto1));
        System.out.println("5 " + relativo1.relativize(relativo2));
        System.out.println("6 " + absoluto1.relativize(relativo1)); // ele não sabe da onde esse relativo está, então vai dar erro




    }
}
