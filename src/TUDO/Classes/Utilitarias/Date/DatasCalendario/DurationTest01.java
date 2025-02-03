package TUDO.Classes.Utilitarias.Date.DatasCalendario;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {

    public static void main(String[] args) {
        // duration é uma classe que é usada para pegar o intervalo de tempo
        //podendo ser ele de anos, meses, dias, horas, segundos e nano


        LocalDateTime now = LocalDateTime.now(); // Localdatetame representa a data e a hora combinadas, sem fusos horarios
                                                //.now() - pega a data e hora atual no momento da execuçao
        LocalDateTime now2Anos = LocalDateTime.now().minusYears(21); // plusyears adiciona 2 anos a cada data (colocamos o numero 2)
        LocalTime timeNow = LocalTime.now(); // representa a hora (horas, minutos, segudos e nanosegundos), sem a data
        LocalTime timeMinus7Horas = LocalTime.now().minusHours(7); // retira 7 horas do horario atual
        Duration d1 = Duration.between(now2Anos,now); // duration: quantidade de tempo entre dois instantes,
                                                        // com a diferença entre duas datas ou dois horarios
        Duration d2 = Duration.between(timeNow,timeMinus7Horas);
        Duration d3 = Duration.between(Instant.now(),Instant.MIN);
        // localdate nao da suporte para segundos, entao ele daria erro se um pedir segundos.

        Duration d4 = Duration.ofDays(23);
        // ele nao trabalha com dias, apenas com horas, minutos e segundos
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

    }
}
