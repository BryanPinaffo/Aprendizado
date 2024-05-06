package TUDO.Orientaçao.objeto.Polimorfismo.Teste;

import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Repositorio.Repositorio;
import TUDO.Orientaçao.objeto.Polimorfismo.Servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {

    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioBancoDeDados();
        // quando se trata de interface, sempre colocamos o tipo mais generico possivel
        // que no caso é a propria interface
        // e depois colocamos o objeto que queremos (NEW alguma coisa)
        repositorio.salvar();

        List<String> list = new LinkedList<>(); // List é o tipo mais generico da interface, e o LinkedList é o mais especializado
        list.add("Goku");
        list.add("Naosei");
        list.add("SLAOQ");
        System.out.println(list);
        // list foi so um exemplo
    }
}
