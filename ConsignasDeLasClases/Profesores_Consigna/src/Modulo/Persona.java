package Modulo;

public class Persona {

    //Atributos
    private String nombre;
    private int edad;


    //Constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //MEtodos

    public String getInfo(){
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad();
    }
}
