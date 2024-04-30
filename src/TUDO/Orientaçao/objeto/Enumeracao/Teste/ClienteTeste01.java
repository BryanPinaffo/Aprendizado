package TUDO.Orientaçao.objeto.Enumeracao.Teste;

import TUDO.Orientaçao.objeto.Enumeracao.Dominio.Cliente;
import TUDO.Orientaçao.objeto.Enumeracao.Dominio.TipoCliente;
import TUDO.Orientaçao.objeto.Enumeracao.Dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("batata", TipoCliente.PEESOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("batata02",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println("-------------------------------");
        System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente01 = TipoCliente.valueOf("PEESOA_FISICA");

        System.out.println(tipoCliente01);

        TipoCliente tipoCliente02 = TipoCliente.tipoClientePorNomeRelatorio("PESSOA_JURIDICA");
        System.out.println(tipoCliente02);




    }
}
