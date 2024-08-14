package TUDO.Classes.Utilitarias.Date.FormatacaoTest;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTeste01 {
    public static void main(String[] args) {

        // utilizado para formatar tando datas quanto moedas e numeros baseado na preferencia do usuario ou na localizaçao do mesmo
        Locale localeitay = new Locale("it", "IT"); // criado para trabalhar com internacionalizaçao
        Locale localBR = new Locale("pt", "BR");
        Locale localande = new Locale("is", "IS"); // ISO 639 / ISO 3166 - 2
        Locale localIndia = new Locale("hi", "IN");
        Locale localJapa = new Locale("ja", "JP");
        Locale localCoreia = new Locale("ko", "KR");

        Calendar calendario = Calendar.getInstance();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeitay);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localBR);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localande); // islandes
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localJapa);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localCoreia);


        System.out.println(df.format(calendario.getTime()));
        System.out.println(df2.format(calendario.getTime()));
        System.out.println(df3.format(calendario.getTime()));
        System.out.println(df4.format(calendario.getTime()));
        System.out.println(df5.format(calendario.getTime()));
        System.out.println(df6.format(calendario.getTime()));

        System.out.println(localCoreia.getDisplayCountry());
        System.out.println(localJapa.getDisplayCountry());
        System.out.println(localIndia.getDisplayCountry());
        System.out.println(localBR.getDisplayCountry(localCoreia));


    }
}
