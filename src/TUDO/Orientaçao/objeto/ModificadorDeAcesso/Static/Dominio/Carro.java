package TUDO.Orientaçao.objeto.ModificadorDeAcesso.Static.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    private static double velocidadeLimite = 250;
    // ele vai depois do modificador de acesso e antes do tipo
    // o static faz ele pertencer a uma classe e nao a uma instancia

    // ele vai fazer o atributo pertencer a classe
    // e todos os objetos vao compartilhar o mesmo valor


    // resumidamente, um metodo static nao precisa que vc instancie ele (crie um objeto), pois vc pode usar o NomeDaClasse.
    // resumindo, vc usa o nome da classe para chamar ela, assim, nao necessitando da criaçao de um objeto


    // metodos static nao pode acessar atributos de instancia
    // pq quando vc usa static, pode ocorrer de nao ter objeto em memoria, entao como vc vai usar um atributo que so
    // pode existir com um objeto em memoria?
    // so podemos usar variaveis staticas dentro de metodos static
    // porem podemos usar vatiaveis static dentro de metodos nao static


    // os metodos static podem ser usados apenas quando eles nao precisam acessar um atributo da instancia da classe

    // tudo que é static é criado ANTES dos atributos nao static serem criados
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir(){

        System.out.println("---------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Nome: "+this.velocidadeMaxima);
        System.out.println("Nome: "+Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){

        Carro.velocidadeLimite = velocidadeLimite;
        //this. nao funciona pq ele faz referencia a uma instancia (um objeto)
        // e o static faz referencia a propria classe
    }

    public static double getVelocidadeLimite(){

        return Carro.velocidadeLimite;
    }


    public void setNome (String nome){

        this.nome = nome;

    }

    public String getNome(){

        return this.nome;

    }

    public void setVelocidadeMaxima (double velocidadeMaxima){

        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima(){

        return this.velocidadeMaxima;
    }

}
