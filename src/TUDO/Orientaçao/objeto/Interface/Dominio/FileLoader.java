package TUDO.Orientaçao.objeto.Interface.Dominio;

import TUDO.Orientaçao.objeto.Interface.Dominio.DataLoader;

public class FileLoader implements DataLoader,DataRemover {

    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println(" Deletando dados de um arquivo");
    }


}
