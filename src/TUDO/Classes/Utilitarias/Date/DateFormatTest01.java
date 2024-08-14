package TUDO.Classes.Utilitarias.Date;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

        System.out.println(df.format(calendar.getTime()));


        System.out.println("-----------------separaçao------------------");

       dataEHora();

    }

    public static void dataEHora(){
        Calendar calendar = Calendar.getInstance();  // calendar é uma classe que permite manipular facilmente partes de uma data

        DateFormat [] df = new DateFormat[7]; // formata de uma maneira especifica, geralmente em string, sendo mais legiveis para as pessoas


        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : df) {

            System.out.println(dateFormat.format(calendar.getTime()));
        }


    }


}
