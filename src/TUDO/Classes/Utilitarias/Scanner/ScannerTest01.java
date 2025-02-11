package TUDO.Classes.Utilitarias.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {

        String texto = "Levi, Eren, Mikasa, Luffy, Zoro, Jujutsu, Kaisen,200,150";

        String [] nomes = texto.split(",");

        for (String nome : nomes){

            System.out.println(nome.trim());

        }

    }
}
