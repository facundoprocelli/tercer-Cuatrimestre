package modelo;

public class Paciente {

    private double peso;
    private double altura;


    public Paciente(){
        this.peso = 0;
        this.altura = 0;
    }

    public Paciente(double peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Metodos

    public double  calcularIndiceMasaCorporal(){

        double resultado = (getPeso() / Math.pow(getAltura(), getAltura()));
        return resultado;
    }
}
