package Modelo;

import Interfaz.IInstalacionDeportiva;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {

    // Atributos

    String nombre;

    //Constructor


    public Polideportivo(double superficie, String nombre) {
        super(superficie);
        this.nombre = nombre;
    }

    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    // Metodos


    @Override
    public int getTipoDeInstalacion(){

        return 1;
    }


    public String mostrarDatos(){
        return super.mostrarDatos() + " y se llama " + '"' + getNombre() + '"';
    }

}
