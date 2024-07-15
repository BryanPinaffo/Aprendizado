package TUDO.Classes.Utilitarias.Wrappers;

import java.sql.SQLOutput;

public class WrapperTest01 {
    //wrapper sao objetos que irao encapsular tipos primitivos (transformando eles em objetos)
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 20F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // para transformar em wrapper, apenas temos que colocar a primeira letra com maisculos, tendo algumas excessoes
        // como o integer e o character

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 20F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        // nao podemos mais tirar o L do long, como exemplo, pois ele vira um int, e o int nao faz parte da biblioteca dessa classe Long

        // autoboxing e unboxing
        // autoboxing = é quando vc faz o java transformar o tipo primitivos em tipo wrapper, como foi feito no exemplo acima.


        //unboxing = o processo ao contrario, transformando ele de wrapper para primitivo  ex:

        int i = intW; // unboxing

        Integer intw2 = Integer.parseInt("4");
        // parseint é usado para converter uma string que representa um numero e um tipo primitivo 'int'.

        boolean verdadeiro = Boolean.parseBoolean("TRUE");
        System.out.println(verdadeiro);
        System.out.println(intw2);

        System.out.println(Character.isDigit('A')); // se é um digito ou nao
        System.out.println(Character.isDigit('9'));

        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));

    }
}
