package TUDO.Classes.Utilitarias.Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){

            System.out.println("Domingo é o primeiro dia da semana");

        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // vai mostrar o dia da semana
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 1); // adiciona 1 dia
        c.add(Calendar.HOUR,3); // adiciona 3 horas

        Date date = c.getTime();

        System.out.println(date);
    }
}
