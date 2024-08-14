package TUDO.Classes.Utilitarias.Date.FormatacaoTest;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {

    public static void main(String[] args) {
        Locale localBR = Locale.getDefault();
        Locale localIT = Locale.ITALY;
        Locale localJP = Locale.JAPAN;
        Locale localCN = Locale.CANADA;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(localBR);
        nfa[1] = NumberFormat.getCurrencyInstance(localJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localCN);
        nfa[3] = NumberFormat.getCurrencyInstance(localIT);



        double valor =100.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());

            System.out.println(numberFormat.format(valor));
        }

        String valorString = "￥100.2130";

        try {
            System.out.println(nfa[1].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
