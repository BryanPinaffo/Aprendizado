package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

public class TemporalAdjustersTest02 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.of(2025,2,8);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate now1 = LocalDate.of(2025,2,8).with(new ObterProximoDiaUtil());

        System.out.println(now1);
        System.out.println(now1.getDayOfWeek());


    }
}

class ObterProximoDiaUtil  implements TemporalAdjuster{


    @Override
    public Temporal adjustInto(Temporal temporal) {

        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        // o temporal permite trabalhar com a data de forma generica
        // o Chronofield esta transformando os dias da semana em forma de numeros
        // fazendo com q o primeiro dia da semana seja o "1"

        int addDays = 1;

        switch (dayOfWeek){

            case THURSDAY -> {
                addDays = 4;
                break;

            }

            case FRIDAY -> {
                addDays = 3;
                break;
            }

            case SATURDAY -> {
                addDays = 2;

                break;
            }
            case SUNDAY -> {
                addDays = 1;
                break;
            }
            // usando o switch case, estamos manipulando os dias da semana para que, ele considere sexta, sabado e domingo como "finais de semana"

        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
        // ele adiciona um numero especifico de dias ( usando o addDays)
        // e usa o objeto temporal o ChronoUnit, fazendo com que o numero seja representado em quantidade de dias
    }
}