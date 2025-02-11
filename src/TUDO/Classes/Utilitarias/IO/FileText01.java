package TUDO.Classes.Utilitarias.IO;

import java.io.File;
import java.io.IOException;
import java.time.ZoneId;
import java.util.Date;

public class FileText01 {
    public static void main(String[] args) {


        File file = new File("texto.txt");


        try {


                boolean isCreated = file.createNewFile();

                System.out.println("criou " + isCreated);
            System.out.println("path" + file.getPath());
            System.out.println("pathAbsolut" + file.getAbsolutePath());
            System.out.println("é um diretorio" + file.isDirectory());
            System.out.println("é um arquivo" + file.isFile());
            System.out.println("é um arquivo" + file.isHidden()); // arquivo oculto do win
            System.out.println("ultima modificaçao   " + new Date( file.lastModified()).toInstant().atZone(ZoneId.systemDefault()));

            boolean exists = file.exists();

                if (exists) {

                    boolean delete = file.delete();

                    System.out.println("deletou " + delete);

                }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
