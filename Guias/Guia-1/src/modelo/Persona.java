package modelo;

public class Persona {

    private String nombre;
    private int edad;
    private String genero;


    public Persona(){

        this.nombre = "Sin nombre";
        this.edad = 0;
        this.genero= "Sin genero";
    }

    public Persona(String p_nombre, int p_edad, String p_genero) {
        this.nombre = p_nombre;
        this.edad = p_edad;
        this.genero = p_genero;
    }

    // Getters


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }



    // Setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Otras funciones


    public String getInfo(){
        return ("La persona se llama: " + getNombre() + " es " + getGenero() + " y tiene " + getEdad());
    }



}
