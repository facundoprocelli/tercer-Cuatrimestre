package Modulo;

public class Persona {

    // Atributos
    String nombre;
    int edad;

    // Constructor


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y  Setters


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Metodos

    public  String getInfo(){
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad();
    }
}
