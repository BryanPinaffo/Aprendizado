package TUDO.Orientaçao.objeto.Polimorfismo.Dominio;

import TUDO.Orientaçao.objeto.Polimorfismo.Dominio.Produto;

public class Tomate extends Produto {

    private String dataValidade;

    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculamdo imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    @Override
    public String toString() {
        return "Tomate " +
                "nome= " + nome +
                " valor= " + valor;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
