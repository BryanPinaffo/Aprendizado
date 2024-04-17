package TUDO.Aprendizado.Inicial.Condicionais;

public class CondicionaisOperadorTernario {

    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar= "Doar 500 reais";
        String mensagemnaodoar = "ainda nao posso;";
        // (condicao) ? verdadeiro : falso;
        // se o salario for maior que 5000 mil? faça tal coisa : ( caso nao tenha) faça tal coisa
        //so funciona com string

        String resultado = salario > 5000 ? mensagemDoar : mensagemnaodoar;

        // dificil  nao viavel





       /* if (salario > 5000){

            resultado = mensagemDoar;
        }

        else {
            resultado = mensagemnaodoar;
        }

        */
        // podemos usar o if, porem nesse caso, onde podemos usar o if/else para
        // guardar o valor de uma variavel, podemos usar o operador ternario
        System.out.println(resultado);

    }

}
