package TUDO.Classes.Utilitarias.Scanner;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {

        String texto = "Levi, Eren, Mikasa, Luffy, Zoro, Jujutsu, Kaisen,200,150, true, false";
        Scanner scanner = new Scanner(texto); // o scanner sempre pede uma String
        scanner.useDelimiter(","); // colocando o delimitador

        while (scanner.hasNext()){ // has next? tem proximo?

           // System.out.println(scanner.next().trim()); // scanner.next esta falando para ele mostrar esse proximo

            if(scanner.hasNextInt()) {

                int i = scanner.nextInt();

                System.out.println("é um int = " + i );
            }
            else if(scanner.hasNextBoolean()) {

                boolean i = scanner.nextBoolean();

            }

            else {

                System.out.println(scanner.next());

            }
        }
    }

}
