package TUDO.Classes.Utilitarias.NIO;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class BasicFileAttributesTime {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes
        //DosFileAttributes   voltada para sistemas Win
        //PosixFilePermission voltada para sistema linux

        File file = new File("Pasta/novo2.txt");
        LocalDateTime date = LocalDateTime.now();
        boolean isCreated = file.createNewFile();

        boolean IsModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta/novo_path2.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(LocalDateTime.of(2020, 12, 24, 16, 24).atZone(ZoneId.of("UTC")).toInstant());
        Files.setLastModifiedTime(path,fileTime);

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));

    }
}
