package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {


   LocalTime local= LocalTime.of(12,31,32);
   LocalTime local2 = LocalTime.now();
        System.out.println(local);
        System.out.println(local2);

        System.out.println(local.getHour());
        System.out.println(local.getMinute());
        System.out.println(local.getSecond());
        System.out.println(local.getNano());
        System.out.println(local.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
