package TUDO.Aprendizado.Inicial.Array;

public class ArraysForeach {
    public static void main(String[] args) {

        int numero01 [] = new int[10];

        int numero [] = {1,2,3,4,5};

        for(int i=0; i < numero.length;i++){
           // System.out.println(numero[i]);
        }

        for(int num:numero){ // ele vai repetir o array todinho


            System.out.println(num);

        }


    }
}
