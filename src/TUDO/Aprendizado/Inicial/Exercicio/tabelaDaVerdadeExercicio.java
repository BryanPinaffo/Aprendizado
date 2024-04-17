package TUDO.Aprendizado.Inicial.Exercicio;

public class tabelaDaVerdadeExercicio {
    public static void main(String[] args) {

        // dado um determinado salario, qual o valor que vc tem que pagar de imposto

        double salario = 70000;

        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;

        double salarioUm = 34712;
        double salarioDois = 68507;

        String mensagemSalario;
        double contaImposto;
        double contaSalario;

        if(salario <= salarioUm){
            contaImposto = salario * primeiraFaixa;
            contaSalario = salario - contaImposto;
             mensagemSalario = "seu salario é " + contaSalario+" e o valor que vc paga de imposto é "+contaImposto;
        }

        else if (salario <= salarioDois){
            contaImposto= salario * segundaFaixa;
            contaSalario = salario - contaImposto;
             mensagemSalario = "seu salario é " + contaSalario +" e o valor que vc paga de imposto é "+ contaImposto;
        }
        else {
            contaImposto = salario * terceiraFaixa;
            contaSalario = salario - contaImposto;
             mensagemSalario = "seu salario é " + contaSalario +" e o valor que vc paga de imposto é "+ contaImposto;
        }
        System.out.println(mensagemSalario);
    }

}
