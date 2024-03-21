package Clases;

//Aca creo una persona normal



// Agrego todos los atributos
public class Persona {

    String nombre;
    String apellido;
    int peso;
    int altura;
    String genero;


    // Creo el constructor vacio con [alt] + [insert]
    public Persona() {


    }

    // Creo el constructor completo con [alt] + [insert]
    public Persona(String nombre, String apellido, int peso, int altura, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
    }

    // Creo todos los getters y Setters con [alt]+[insert]

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}