package modelo;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(){
        this.titulo = "Sin titulo";
        this.autor = "Sin autor";
        this.anioPublicacion = 0;
    }
    public Libro(String p_titulo, String p_autor, int p_anioPublicacion) {
        this.titulo = p_titulo;
        this.autor = p_autor;
        this.anioPublicacion = p_anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }


    // Metodos

    public String obtenerInformacion(){

        return getTitulo() + " fue escrito por " + getAutor() + " en el año " + getAnioPublicacion();
    }
}
