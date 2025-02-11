package TUDO.Classes.Utilitarias.IO;

import java.io.File;
import java.util.Date;

public class UltimaModificacao {
    public static void main(String[] args) {


        File file = new File("C:\\senhas e problemas\\mikrotik");


        try {

            System.out.println("ultima modificaçao  " + new Date( file.lastModified()));



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
