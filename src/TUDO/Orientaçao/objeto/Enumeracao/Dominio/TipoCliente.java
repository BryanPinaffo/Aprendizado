package TUDO.Orientaçao.objeto.Enumeracao.Dominio;

public enum TipoCliente {
    // quando vc for criar a classe, clicar em ENUM
    // todos os atributos que iremos criar é cosntante

    PEESOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public String nomeRelatorio;


    TipoCliente(int valor, String nomeRelatorio) {

        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;

    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {      // value retorna um array de todos os tipos clientes
                                                        // o for vai percorrer esse array

            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) { // se tipo cliente.getnomerelatorio for IGUAL (usa equals)
                                                                        // for igual nomeRelatorio
                return tipoCliente; // retorna tipo cliente
            }
        }

        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
