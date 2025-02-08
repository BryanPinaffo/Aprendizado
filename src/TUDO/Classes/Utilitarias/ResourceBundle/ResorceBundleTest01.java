package TUDO.Classes.Utilitarias.ResourceBundle;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResorceBundleTest01 {

    // forma que o java tem de pegar uma mensagem baseada em um local
    public static void main(String[] args) {

        String dicionario = JOptionPane.showInputDialog("Digite seu a palavra com .: ");

        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        //bundle.getString("hello");
        System.out.println(bundle.getString(dicionario));


        //System.out.println(bundle.getString("good.morning"));

       // System.out.println(bundle.getString("hi")); // nesse caso, vai como lingua geral, ja que o message nao foi especificado, e o hi só existe nesse properties

       // bundle = ResourceBundle.getBundle("message",new Locale("en","US"));
       // System.out.println(bundle.getString("hello"));
        //System.out.println(bundle.getString("good.morning"));


        //System.out.println(bundle.getString("hi"));

        //Locale("fr","CA")

        //message_fr_CA.properties
        //message_fr.properties
        //message_pt_BR.properties
        //message_en_US.properties
        //message.properties

        // vai procurar isso tudo

        //só depois disso ele lança uma exception



    }
}
