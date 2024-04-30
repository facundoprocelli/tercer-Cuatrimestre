package modelo;

public class Mensaje {

    private  String nombre;

    private int edad;

    public Mensaje() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public Mensaje(String p_nombre, int p_edad){

        this.nombre = p_nombre;
        this.edad =p_edad;
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    // Setters

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo(){
        return "Bienvenido " +  getNombre() + ", debido a que su edad es " + getEdad() + " usted ha ganado $1.000.000 de dolares";
    }
}


