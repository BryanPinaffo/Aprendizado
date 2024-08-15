package TUDO.Classes.Utilitarias.Date.FormatacaoTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {

        int i = 0;
        while (true) {

            i++;

            SimpleDateFormat sdf = new SimpleDateFormat(" HH:mm:ss:SSSS");


            String saida = String.format("Data formatada: %s  |  Contador %d ", sdf.format(new Date()), i);

            System.out.print("\r" + saida);  // "/r" funçao de sobrescrever o texto exsistente na mesma linha

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
