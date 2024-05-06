package TUDO.Orientaçao.objeto.Polimorfismo.Servico;

import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {

        System.out.println("Salvando na memoria");

    }
}
