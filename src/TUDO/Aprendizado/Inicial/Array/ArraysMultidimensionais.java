package TUDO.Aprendizado.Inicial.Array;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        //array linkados um no outro, aray dentro de um array

        // primeiro array representa o mes
        // o segundo o dia

        int [][] dias = new int[4][4]; // colunos e fileiras

        dias[0][0] = 31;
        dias[0][1] = 31;
        dias[1][0] = 31;
        dias[1][1] = 31;
        dias[1][2] = 31;
        dias[1][3] = 31;



        dias[2][0] = 31;
        dias[0][2] = 31;
        dias[2][2] = 31;
        dias[2][1] = 31;
        dias[2][3] = 31;



        dias[3][0] = 31;
        dias[0][3] = 31;
        dias[3][3] = 31;
        dias[3][1] = 31;
        dias[3][2] = 31;

        for( int i = 0; i < dias.length;i++){
            for( int j = 0; j < dias[0].length;j++) {
                //System.out.println(dias[i][j]);
            }
        }

        int larrayMultiLouco [][] = new int [5] [];

        larrayMultiLouco [0] = new int [5];
        larrayMultiLouco [1] = new int [5];
        larrayMultiLouco [2] = new int[5];
        larrayMultiLouco [3] = new int[5];
        larrayMultiLouco [4] = new int[5];


        int seiNao;

        for (int i = 0; i < larrayMultiLouco.length; i++){
            System.out.println("uau");

            for( int j = 0; j < larrayMultiLouco.length;j++){
                System.out.println("uuooouuuu");


            }

        }



    }
}
