package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        // zonas nada mais é do q locais de horas, tipo, brasil

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        //MAP: uma coleçao de chave e valor

        System.out.println(shortIds);
        // saber as zonas que o JAVA suporta
        System.out.println("---------------------");

        System.out.println(ZoneId.systemDefault());
        // a ZONA que o computador esta
        System.out.println("---------------------");

        ZoneId india = ZoneId.of("America/Indiana/Indianapolis");
        System.out.println(india);
        System.out.println("---------------------");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("---------------------");

       ZonedDateTime zonedDateTime = now.atZone(india); // mostra a data, o horario e a zona, precisa colocar o ZonedDateTime para aparecer a zona
        System.out.println(zonedDateTime);
        System.out.println("---------------------");

        Instant nowInstant = Instant.now(); // instant é a hora que nao é influenciada pelas regioes, ele mostra o horario real
        System.out.println(nowInstant);
        System.out.println("---------------------");
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(india);
        System.out.println(zonedDateTime2);
        System.out.println("---------------------");

        System.out.println(ZoneOffset.MAX); // pode mudar manualmente o horario, por exemplo, se na india ele é -5 horas, entao podemos setar 5h aqui
        System.out.println(ZoneOffset.MIN);

        ZoneOffset zoneOffset =  ZoneOffset.of("-05:00"); // colocamos q é -5h, sempre 00:00
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime); // setado para -5h, porem nao tem a zona
        System.out.println("---------------------");

        OffsetDateTime offsetDateTime03 = OffsetDateTime.of(now,zoneOffset);
        System.out.println(offsetDateTime03);
        System.out.println("---------------------");

        OffsetDateTime offsetDateTime04 = nowInstant.atOffset(zoneOffset);
        System.out.println(offsetDateTime04);
        System.out.println("---------------------");


        JapaneseDate fromJapan = JapaneseDate.from(LocalDate.now());
        System.out.println("Horario no japao"+fromJapan);
        System.out.println("---------------------");

        LocalDate localDateEra = LocalDate.of(1900,2,1);
        JapaneseDate eraJapan = JapaneseDate.from(localDateEra);
        System.out.println(eraJapan);


        // resumidamente, ele converte a data dependendo do fuso horario, muito bom
    }
}
