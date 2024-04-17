package TUDO.Orientaçao.objeto.Metodos.Dominio;

public class ImprimeEstudante {
    public void imprime(EstudantesMetodos estudante){ // dei um nome ao metodo (imprime) e dei um nome ao metodo que estou puxando (estudante)

        //podemos criar varias variaveis( como estudantes) que pode fazer referencia para o mesmo objeto (como estudante01 no estudantesMetodosTeste01)

        System.out.println("-----------------------------");

        System.out.println("Estudante :"+"\n" +
                            " Nome: "+estudante.nome+"\n"+
                            " Idade: "+estudante.idade+"\n"+
                            " Sexo: "+ estudante.sexo);

        // podemos criar uma classe para imprimir, nela, deve possuir um public onde vamos puxar o objeto na qual vamos puxar a referencia
        // que iremos imprimir, isso deixa o codigo mais limpo e organizado



    }
}
