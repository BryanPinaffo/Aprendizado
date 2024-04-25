package TUDO.Orientaçao.objeto.Enumeracao.Teste;

import TUDO.Orientaçao.objeto.Enumeracao.Dominio.Cliente;
import TUDO.Orientaçao.objeto.Enumeracao.Dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("batata", TipoCliente.PEESOA_FISICA);
        Cliente cliente02 = new Cliente("batata",TipoCliente.PEESOA_FISICA);
        Cliente cliente03 = new Cliente("batata",TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);


    }
}
