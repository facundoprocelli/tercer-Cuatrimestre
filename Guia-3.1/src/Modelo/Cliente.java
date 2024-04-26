package Modelo;

public class Cliente {

    //Atributos

    private int id;
    private String nombre;
    private char genero;

    // Constructor


    public Cliente(int id, String nombre, char genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
