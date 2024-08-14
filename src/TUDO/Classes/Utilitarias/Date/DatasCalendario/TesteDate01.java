package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import java.util.Date;

public class TesteDate01 {
    public static void main(String[] args) {
        Date dt = new Date(1720000000099L); // trabalha em ms, é usado long
        dt.setTime(dt.getTime() + 3_600_000);
        System.out.println(dt);

    }
}
