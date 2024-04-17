package TUDO.Aprendizado.Inicial.Repetiçao;

public class EstruturaDeRepetiçao {
    public static void main(String[] args) {
        //while, do while, for
        // ate quando ou ate quanto ele vai se repetir

        int count = 0;
        while(count <= 30) {

            System.out.println(count);
            count ++;
        }

        //..............................................................................................

        do {
            System.out.println("eu sou lindo");

        }
        while (count <10);
        // faça ( ele vai fazer a açao 1 vez, obrigatoriamente) enquanto ( ai ele entra no while)


        //..........................................................................................

        for( int countl = 0 ;countl<10; countl++){
            // para int countl = 0 ate countl < 10 acrescentando countl = countl + 1 faça:

            System.out.println("apenas conte "+countl);
        }


    }
}
