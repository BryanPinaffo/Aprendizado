package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import TUDO.Orientaçao.objeto.ExercicioAssociaçao.Dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = LocalDate.of(2022, Month.AUGUST,6);
        LocalTime localTime = LocalTime.of(9,45,21);
        LocalDateTime ldt1 = localDate.atTime(localTime);
        LocalDateTime ldt2 = localTime.atDate(localDate);

        System.out.println(localDateTime);
        System.out.println(ldt1);



    }
}
