package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); // tipos de formataçao do localdate
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        String s4 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); // padrao localdate
        String s5 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        // isso tudo sao formataçao do localdate para String

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        LocalDate parse = LocalDate.parse("20210219",DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse);

        LocalDate parse2 = LocalDate.parse("2021-02-19+05:00",DateTimeFormatter.ISO_DATE);
        System.out.println(parse2);

        LocalDate parse3 = LocalDate.parse("2021-02-19",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse3);

        // nesse caso, estamos fazendo ao contrario, fazendo uma string de uma data, se transformar em um objeto LocalDate

        System.out.println("-------------------");

        LocalDateTime now = LocalDateTime.now();
        String string4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(string4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-02-04T16:38:48.3006551", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        // tbem existe essa forma que faz a mesma coisa

        // formatando uma data
        DateTimeFormatter dateTimeFormatterAME = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // pequeno detalhe, nao esquecer que o M de MES precisa ser maiusculo
        // Aqui, o pattern "dd/MM/yyyy" define que a data será exibida no formato dia/mês/ano

        String formatAME = LocalDate.now().format(dateTimeFormatterAME);
        System.out.println(formatAME);

        LocalDate parse5 = LocalDate.parse("02/04/2025",dateTimeFormatterAME);
        System.out.println(parse5);


        DateTimeFormatter dateTimeFormatterCHI = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.CHINA);
        String formatChi = LocalDate.now().format(dateTimeFormatterCHI);
        System.out.println(formatChi);

        LocalDate parseCHI = LocalDate.parse("04/02/2025",dateTimeFormatterCHI);
        System.out.println(parseCHI);



    }
}
