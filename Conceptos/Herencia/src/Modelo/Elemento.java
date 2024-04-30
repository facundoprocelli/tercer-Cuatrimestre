package Modelo;

public class Elemento {

    private  String titulo;

    public Elemento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String metodo(){
        return "soy elemento";
    }
}
