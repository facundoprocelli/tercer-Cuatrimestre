package modelo;

public class Lapiz {

    // Atributos

    private String color;
    private int largo;
    private String marca;

    // Constructor vacio
    public Lapiz() {
        color = "";
        largo  = 0;
        marca = "Sin marca";
    }


    // Constructor Completo
    public Lapiz(String p_color, int  p_largo, String p_marca) {
        this.color = p_color;
        this.largo = p_largo;
        this.marca = p_marca;
    }
}
