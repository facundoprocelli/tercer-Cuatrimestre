package Modulo;

public class Autor {


    //Atributos
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    //Constructor
    public Autor(String nombre, String apellido, String email, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    //Metodos

    public String getNombre() {
        return nombre;
    }


    //Sobreescrituras


    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }
}
