package Metodo;

public class DVD extends Elemento {

    //Atributos
    private String director;

    // Constructor


    public DVD(String titulo, int duracion,boolean loTengo, String comentario, String director) {
        super(titulo, duracion,loTengo, comentario); // El constructor va sin el punto
        this.director = director;
    }
    public  DVD(){

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String imprimir(){

        return  "\nDirector: " + getDirector() + "\n" + super.imprimir();
    }
}
