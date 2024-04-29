package TUDO.Orientaçao.objeto.Enumeracao.Dominio;

public enum TipoCliente {
    // quando vc for criar a classe, clicar em ENUM
    // todos os atributos que iremos criar é cosntante

    PEESOA_FISICA(1,"Pessoa Fisica"),
    PESSOA_JURIDICA(2,"Pessoa Juridica");

    public final int VALOR;
    public String tipoPessoa;

    TipoCliente(int valor, String tipoPessoa) {

        this.VALOR = valor;
        this.tipoPessoa = tipoPessoa;

    }

}
