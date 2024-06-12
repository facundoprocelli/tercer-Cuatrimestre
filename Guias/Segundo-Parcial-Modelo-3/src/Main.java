import Exceptions.sobrePasaCantiadException;
import Modelo.*;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Envoltorio envoltorio = new Envoltorio();

        envoltorio.pasarAeropuertosAJSON();
        ArrayList<Aeropuerto> aeropuertos = null;

          aeropuertos=   envoltorio.pasarAeropuertosXCapacidad(100);
        System.out.println(aeropuertos);

        ListaGenerica<Piloto> pilotos = envoltorio.guardarPilotos();
        System.out.println(pilotos);

        HashSet<Tag> tags = envoltorio.pasarTagsAHashSet(pilotos);

        System.out.println(tags);

    }
}