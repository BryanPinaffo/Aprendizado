package TUDO.Classes.Utilitarias.Date.FormatacaoTest;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {

    public static void main(String[] args) {
        Locale localBR = Locale.getDefault();
        Locale localIT = Locale.ITALY;
        Locale localJP = Locale.JAPAN;
        Locale localCN = Locale.CANADA;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance(localBR);
        nfa[1] = NumberFormat.getInstance(localJP);
        nfa[2] = NumberFormat.getInstance(localCN);
        nfa[3] = NumberFormat.getInstance(localIT);


        double valor = 10_100_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }


        String valorString = "10100000.2130";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
