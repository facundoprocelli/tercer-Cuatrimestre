package Clases;

//Aca creo una persona normal



// Agrego todos los atributos
public class Persona {

    String nombre;
    String apellido;
    int peso;
    int altura;
    String genero;
    int edad;


    // Creo el constructor vacio con [alt] + [insert]
    public Persona() {
        this.nombre = "sin nombre";
        this.apellido = "sin apellido";
        this.peso = 0;
        this.altura = 0;
        this.genero = "sin genero";
        this.edad = 0;


    }

    // Creo el constructor completo con [alt] + [insert]
    public Persona(String nombre, String apellido, int peso, int altura, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}