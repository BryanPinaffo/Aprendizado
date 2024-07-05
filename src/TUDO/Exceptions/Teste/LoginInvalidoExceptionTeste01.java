package TUDO.Exceptions.Teste;

import TUDO.Exceptions.Dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {


        try {
            logar();
        } catch (LoginInvalidoException e) {

            e.printStackTrace();

        }

    }
    private static void logar() throws LoginInvalidoException {

        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Goku";
        String senha = "SSJ";

        System.out.println("Usuario: ");
        String usernamePessoa = scanner.nextLine();

        System.out.println("Senha: ");
        String senhaPessoa = scanner.nextLine();

        if(!usernameDB.equals(usernamePessoa) || !senha.equals(senhaPessoa)) {

            throw new LoginInvalidoException("Usuario ou Senha invalidos");

        }

        System.out.println("usuario logado com sucesso");

    }
}
