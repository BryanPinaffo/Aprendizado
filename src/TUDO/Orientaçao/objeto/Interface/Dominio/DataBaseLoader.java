package TUDO.Orientaçao.objeto.Interface.Dominio;

public class DataBaseLoader implements DataLoader,DataRemover {
    // na interface nao se usa extends, se usa implements

    @Override
    public void load() {
        System.out.println("carregando dados no banco de dados");
    }


    @Override
    public void remove() {
        System.out.println("removendo do banco de dados");
    }

    @Override
    public void chekPremission() {
        System.out.println("checando permissao do arquivo");
    }

    public static void retrieveMaxDataSize(){

        System.out.println("Dentro da classe");
    }

}
