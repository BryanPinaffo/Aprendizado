package TUDO.Orientaçao.objeto.Polimorfismo.Servico;

import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {

        System.out.println("salvando no banco de dados");

    }
}
