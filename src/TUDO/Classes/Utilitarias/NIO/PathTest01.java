package TUDO.Classes.Utilitarias.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\bryan-pinaffo\\IdeaProjects\\Aprendizado\\file.txt");
        Path p2 = Paths.get("C:\\Users\\bryan-pinaffo\\IdeaProjects\\Aprendizado","file.txt");
        Path p3 = Paths.get("C:","Users\\bryan-pinaffo\\IdeaProjects\\Aprendizado\\file.txt");
        Path p4 = Paths.get("C:","Users","bryan-pinaffo","IdeaProjects","Aprendizado","file.txt");
        //tem varias formas de mostrar um caminho para o Path

        System.out.println(p1.getFileName().toFile().toPath());
        System.out.println(p2.getFileName().toFile().toPath());
        System.out.println(p3.getFileName().toFile().toPath());
        System.out.println(p4.getFileName().toFile().toPath());
        // toFile = converte o objeto Path em um objeto File
        // toPath = converte um File em um Path
        // getFileName = retorna o último elemento do caminho (file.txt)
    }
}
