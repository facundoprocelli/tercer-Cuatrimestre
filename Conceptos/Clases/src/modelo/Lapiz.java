package modelo;

public class Lapiz {

    // Atributos

    private String color;
    private int largo;
    private String marca;

    // Constructor vacio
    public Lapiz() {
        color = "sin color";
        largo  = 0;
        marca = "Sin marca";
    }

    public Lapiz(String p_color){
        this.color = p_color;
    }

    // Constructor Completo
    public Lapiz(String p_color, int  p_largo, String p_marca) {
        this.color = p_color;
        this.largo = p_largo;
        this.marca = p_marca;
    }


    // Getters y Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getInfo(){

        return "El modelos es " + getMarca()+ " el color es " + getColor() + " y el largo es " + getLargo();
    }

}
