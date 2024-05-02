package TUDO.Orientaçao.objeto.Interface.Dominio;

public interface DataLoader {
   // como se fosse um contrato

    // na interface, todos os metodos sao publicos e abstratos
   //podendo ser default, porem tem que prover uma açao/ implementaçao a ela

    // interface tem o mesmo objetivo dos metodos abstracts, criar uma lei, se vc criar uma classe que implementa DataLoader
    // vc vai ter que adicionar esse metodo

   public static final int MAX_DATA_SIZE = 10;  // forma de criar um atributo na interface, todos eles sao constantes(fixos)

   public abstract void load();
   default void chekPremission(){ // faz uma açao sem a necessidade das classes implementadas colocar esse metodo

      System.out.println("fazendo checagem de permissoes"); // pode colocar metodos com funcionalidade

   }

   public static void retrieveMaxDataSize(){ // nao tem como implementar isso em outras classes, nem ser sobreescrito
                                             // outras classes podem ter metodos exatamente iguais a esse sem ser sobreescrito


      System.out.println("Dentro da interface");

   }
}
