package Modulo;

public class Revista extends Biblioteca{

    private int numero;

    public Revista(String codigo, String titulo, int anioDePublicacion, int numero) {
        super(codigo, titulo, anioDePublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int cuandoSePublico() {
        return this.getAnioDePublicacion();
    }

    @Override
    public String getCodigoDeLeible() {
        return this.getCodigo();
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
                '}';
    }



}
