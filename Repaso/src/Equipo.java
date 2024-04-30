import java.util.Objects;

public class Equipo implements Comparable {

    //Atributos
    private String nombre;
    private int cantidadDeCopas;

    //Constructores
    public Equipo(String nombre, int Cantidad) {
        this.nombre = nombre;
        this.cantidadDeCopas = Cantidad;
    }

    public Equipo(){

    }

    //Getters y Setters

//Se agregan todos los getters y los setters depende
    //Si hay un constructor vacio, tiene que estar el setter

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDeCopas() {
        return cantidadDeCopas;
    }
    //Metodos


    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", cantidadDeCopas=" + cantidadDeCopas +
                '}';
    }


    //Cuando estoy en una super super clase no llama al super porque seria el metodo object y ya no me importa
    //Representacionen forma de caracteres de todos o algunos de los atributos


    //Compara dos elementos en los hashcodes
    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj != null){
            if(obj instanceof Equipo){ //pregunto si es una isntacia de la calse
                Equipo equipoAComparar = (Equipo) obj; // Hago el casteo
                if(equipoAComparar.getNombre().equals(getNombre())){ //Compara el nombre del equipo a comparar con el equipo actual
                    rta = true;
                }
            }
        }
        return rta;

    }


    //La colección set primero verifica si el haschode es igual antes que usar el equals
    // Pero como usa el has, siempre va  ser diferente



    @Override
    public int hashCode() {
        return 1; // Retorno un numero para que el haschode sea igual
                // Entonces todos los objetos van a tener el mismo hashcode
                // Por lo tanto le pregunta al equals y ahi nos dice si es duplicado o no
    }


    //El metodo compare to, no devuelve un booleano, devuelve -1 / 0 / 1
    //La firma es, nombre, retorno, paramentros, visibilidad
    @Override
    public int compareTo(Object aComparar) {
        int rta = 0;

        if(aComparar != null &&  aComparar instanceof  Equipo){
            Equipo equipo = (Equipo) aComparar;
            if(getCantidadDeCopas() > equipo.getCantidadDeCopas()){
                rta = 1;
            }
            else if(getCantidadDeCopas() < equipo.getCantidadDeCopas()){

                rta = -1;
            }
        }
        return rta;
    }
}
