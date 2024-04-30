package Metodo;

public class Elemento {
    private String titulo;
    private int duracion;
    private  boolean loTengo;
    private String comentario;

    //Constructor

    public Elemento(){

    }

    public Elemento(String titulo, int duracion, String comentario) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.loTengo = true;
        this.comentario = comentario;
    }

    public Elemento(String titulo, int duracion, boolean loTengo, String comentario) {
    }

    //Getters y Setters


    public String getComentario() {
        return comentario;
    }

    public void setLoTengo(boolean estado) {
        this.loTengo = estado;
    }

    public boolean isLoTengo() {
        return loTengo;
    }

    public String getTitulo() {
        return titulo;
    }


    public int getDuracion() {
        return duracion;
    }

    // Metodos

    public String imprimir(){
        return "Titulo: " + getTitulo() + "\nDuracion: " + getDuracion() + "\nDisponible: " + isLoTengo() + "\nComentario: " + this.getComentario();
    }
}