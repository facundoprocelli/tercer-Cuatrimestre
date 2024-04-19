import Modulo.Diputado;
import Modulo.Legislador;
import Modulo.Persona;
import Modulo.Senador;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Legislador> legisladores = new ArrayList<Legislador>();

        legisladores.add(new Diputado("Juan", 23, "Buenos Aires", "JXC", 23) );
        legisladores.add(new Diputado("carlos", 43, "Cordoba", "JXC", 45) );
        legisladores.add(new Diputado("Ivan", 34, "Salta", "UP", 12) );
        legisladores.add(new Diputado("lucas", 56, "San Juan", "LLA", 46) );
        legisladores.add(new Senador("pepe", 86, "San Juan", "LLA", 10) );
        legisladores.add(new Senador("matias", 67, "La Rioja", "JXC", 8) );
        legisladores.add(new Senador("rodrigo", 26, "Chaco", "UP", 34) );
        legisladores.add(new Senador("facu", 55, "Tierra del fuego", "JXC", 7) );


        for(Legislador e: legisladores){
            System.out.println("\n---------------------\n");
            System.out.println(e.getInfo());
            System.out.println("\n---------------------\n");
        }

    }
}