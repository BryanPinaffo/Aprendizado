package TUDO.Aprendizado.Inicial.PrimitivosOperadores;

public class TiposPrimitivos01 {
    public static void main(String[] args) {
        // 8 tipos de tipos primitivos
        //guardam em memoria um valor simples
        // int, double, float, char, byte short, long, boolean

        int inteiroIdade =24; // quantidade de numero normal INTEIRO
        long inteiroGrande = 24534L; // inteiro MUITO grande
        float salarioFloat = 2545.8F; // numero quebrado normal
        double salarioDouble = 1000.0D; // numero quebrado MUITO grande
        byte idadeByte = 10; // numero bem pequeno 127 INTEIRO
        short idadeShort = 3000; // pequeno mas nem tanto 32767 INTEIRO
        boolean falsoVerdadeiro = false;
        char caractere = 10; // valor da tabela ask
        String nome = "eu sou legal";




        System.out.println("a idade é" + inteiroIdade + inteiroGrande + salarioDouble);
        System.out.println("uma coisa bem louca" + idadeByte + idadeShort + caractere);
        System.out.println("nao sei mais qual eu usei");
    }
}
