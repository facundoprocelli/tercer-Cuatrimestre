import ClasesAbastractas.CD;
import ClasesAbastractas.DVDPelicula;
import ClasesAbastractas.Elemento;
import ClasesAbastractas.DVDPelicula;
import Interf.DragoDeKomodo;
import Interf.ILanzarFuego;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Solo podemos instanciar ClasesAbastractas.DVDPelicula, porque el resto es abstracto
        Elemento elemento = new DVDPelicula("Hello", 123);

        ArrayList<Elemento> elementos  = new ArrayList<>();
        elementos.add(new DVDPelicula("pepe", 123));
        elementos.add(new DVDPelicula("juan", 234));
        elementos.add(new DVDPelicula("MArcos", 345));
        elementos.add(new CD("Lucas", 456));

            int contador = 0;

        for (Elemento e: elementos){
            e.mostrarInfo();
            if (e instanceof CD){
                contador++;

                CD aux = (CD)e;
                aux.metodoCD();

            }


            ILanzarFuego iLanzarFuego = new DragoDeKomodo();
            iLanzarFuego.recargarLlama();
            iLanzarFuego.recargarLlama();
        }
    }
}