package TUDO.Exceptions.Teste;

import TUDO.Exceptions.Dominio.Funcionario;
import TUDO.Exceptions.Dominio.LoginInvalidoException;
import TUDO.Exceptions.Dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar(); // quando vc esta sobreescrevendo um metodo vc nao é obrigado
                                // a declarar as mesmas exception que aquele metodo esta declarando
        // pq a funcionalidade da sobreescrita que vc esta declarando pode ser totalmente diferente,
        // e esse tipo pode ser que nao lance exception


        // nao pode adicionar exception genericas
        // vc nao pode colocar nenhuma exception que nao esteja no metodo original


        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
            System.out.println("deu ruim");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("deu ruim");
        }
    }
}
