package Modulo;

public class Libro {

    //Atributos
    private String titulo;
    private float precio;
    private int stock;
    private Autor autor;

    //Constructor

    public Libro (String titulo, float precio, int stock, Autor autor){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }


    //Metodos


    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void modificarPrecio(float precio){

        if(precio > 0){
            this.precio = precio;
        }
    }

    public void agregarStock(int copias){
        this.stock += copias;
    }

    public String mensajeEspecial(){
        return "El libro, "+ getTitulo() + " de " + getAutor().getNombre() + ". Se vende a " + getPrecio() ;
    }
    //Sobreescrituras



    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }
}


