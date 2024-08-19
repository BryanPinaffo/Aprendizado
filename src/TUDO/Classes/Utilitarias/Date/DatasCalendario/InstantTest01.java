package TUDO.Classes.Utilitarias.Date.DatasCalendario;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

    public static void main(String[] args) {


        Instant ins = Instant.now();

        System.out.println(ins); // esse z é de zulu time
        System.out.println(LocalDateTime.now());
        System.out.println(ins.getEpochSecond());
        System.out.println(ins.getNano());
        System.out.println(Instant.ofEpochSecond(3));
        // ele pega a data de 1970 pois esta relacionado ao conceito de Época Unix,
        // onde usa como ponto de referencia o "inicio do tempo": 00:00:00 UTC de 1º de janeiro de 1970
        // resumindo, o inicio da epoca é 1970, e só estamos acrecentando segundos.

    }


}
