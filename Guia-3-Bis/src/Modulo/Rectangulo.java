package Modulo;

public class Rectangulo {

    private int base;
    private int altura;
    public Rectangulo() {
        this.base = 0;
        this.altura = 1;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }


    public float calcularPerimetro() {
        return 2 * (this.altura + this.base);
    }


    public float calcularArea() {
        return this.altura + this.base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Altura: " + getAltura() +  " Ancho = " + getBase();
    }
    public String mostrarAreaYPerimetro(){
        return "Area = " + calcularArea() + " Perimetro = " + calcularPerimetro();
    }
}
