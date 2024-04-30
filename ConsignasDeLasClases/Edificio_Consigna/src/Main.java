import Modelo.Edificio;
import Modelo.EdificioDeOficinas;
import Modelo.Polideportivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Edificio> edificio = new ArrayList<>();

        edificio.add(new EdificioDeOficinas(100, 10));
        edificio.add(new EdificioDeOficinas(1000, 100));

        edificio.add(new Polideportivo(500, "Pirindonga"));
        edificio.add(new Polideportivo(1000, "Yo"));
        edificio.add(new Polideportivo(100, "pirindoga 2"));


        for(Edificio e : edificio){

            if(e instanceof Polideportivo aux){

                System.out.println(aux.mostrarDatos());
            }
            else if (e instanceof EdificioDeOficinas aux){
                System.out.println(aux.mostrarDatos());
            }
        }
    }
}

// Las clases que se asemajan a la herencia doble es la de Polideportivo, ya que recibe atributos y metodos de Edificio
// Y recibe metodos de IInstalacionDeportiva