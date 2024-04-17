package TUDO.Orientaçao.objeto.ModificadorDeAcesso.Privado.Dominio;

public class Pessoa {

    private String nome;

    private int idade;

    public void imprime(){

        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // na maioria das vezes é criado um metodo para poder usar os atributos com private
    //entao o metodo fica publico, porem o atributo em si, privado


    public void setNome(String nome){

       this.nome = nome; // this so esta sendo usado pq tem um parametro String nome  com o mesmo nome do atributo
                        // entao para ele entender que é do atributo q estamos falando, se coloca o this
    }

    public void setIdade(int idade){

        if (idade <=0){

            System.out.println("idade inválida");
            return;    // pode usar o return caso nao tenha o else e caso o this esteja no public void em si e nao dentro do else

        }

            this.idade = idade;



    }


    public String getNome () { // nao precisa de parametro, ele pega o valor que esta em memoria

        return this.nome;
    }

    public int getIdade(){

        return this.idade;

    }


    // SET: coloca um valor dentro de um atributo
    // geralmente, vc coloca o mesmo nome do atributo privado
    // GET: pegar uma informaçao, apenas

    //RESUMIDAMENTE
    // SET: ele altera ou modifica um valor de um atributo da classe de maneira protejuda

    // GET: ele pega um atributo da classe e seu valor, sendo ele String, double, int e afins

}
