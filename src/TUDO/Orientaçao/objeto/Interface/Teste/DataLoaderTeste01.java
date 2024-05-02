package TUDO.Orientaçao.objeto.Interface.Teste;

import TUDO.Orientaçao.objeto.Interface.Dominio.DataBaseLoader;
import TUDO.Orientaçao.objeto.Interface.Dominio.DataLoader;
import TUDO.Orientaçao.objeto.Interface.Dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.chekPremission();
        fileLoader.chekPremission();

        DataBaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();

    }
}
