package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2024, Month.AUGUST,17);
        LocalDate atual = LocalDate.now();
        date = date.plusWeeks(7); // LocalDate é imutavel,//
        // entao vc tem que associar com a variavel de referencia para conseguir mudar o seu valor.
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date);
        System.out.println(atual);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

    }
}
