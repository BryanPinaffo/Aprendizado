package TUDO.Exceptions.Dominio;

public class LoginInvalidoException extends Exception  {

    public LoginInvalidoException() {

        super("login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
