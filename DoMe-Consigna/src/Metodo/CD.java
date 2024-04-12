package Metodo;

public class CD extends Elemento{

    // Atributos
    private String interprete;

    private int numeroDeTemas;

    // Constructores

    public CD(){

    }
    public CD(String interprete, int numeroDeTemas) {
        this.interprete = interprete;
        this.numeroDeTemas = numeroDeTemas;
    }

    public CD(String titulo, int duracion, boolean loTengo, String comentario, String interprete, int numeroDeTemas) {
        super(titulo, duracion, loTengo, comentario);
        this.interprete = interprete;
        this.numeroDeTemas = numeroDeTemas;
    }

    // Getters y Setters

    public String getInterprete() {
        return interprete;
    }

    public int getNumeroDeTemas() {
        return numeroDeTemas;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void setNumeroDeTemas(int numeroDeTemas) {
        this.numeroDeTemas = numeroDeTemas;
    }

    public String imprimir(){
        return "\n" + super.imprimir() + "\nInterprete: " + getInterprete() + "\nNumero de Temas: " + getNumeroDeTemas();
    }
}
