package ClasesAbastractas;

public abstract class Elemento { // Utilizo abstract para decir que es una clase abstracta


    // Atributos
    private String titulo;
    private int duracion;

// Constructor

    public Elemento(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }


// Getters y Setters
    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }



// Metodos abstractos: Se escribe cual es el comportamiento que pueden tener las subclases
        // Pero no se dice como es que se tiene que hacer, sino que eso lo decide cada clase
        // en particular

    public abstract void reproducir(); // Que pueden hacer las subclases

    public abstract  void mostrarInfo();
}
