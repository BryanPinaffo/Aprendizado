package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH,3);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // quero saber a proxima segunda
        now = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)); // procura essa segunda ou uma proxima
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY)); // procura a proxima segunda
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); // a ultima segunda
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfMonth());  // primeiro dia do mes
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.lastDayOfMonth());  // ultimo dia do mes
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfNextYear());  // primeiro dia do proximo ano
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfNextMonth());  // primeiro dia do proximo mes
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // consegue manipular a data

    }
}
