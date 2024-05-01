package Modulo;

import Interfaces.IPrestable;

public class Libro extends Biblioteca implements IPrestable {

    private boolean prestado;

    public Libro(String codigo, String titulo, int anioDePublicacion) {
        super(codigo, titulo, anioDePublicacion);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    private void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                '}';
    }

    @Override
    public void prestar() {
        if(!isPrestado()){
            setPrestado(true);
        }
    }

    @Override
    public void devolver() {
        if(isPrestado()){
            setPrestado(false);
        }
    }
    @Override
    public int cuandoSePublico() {
        return this.getAnioDePublicacion();
    }

    @Override
    public String getCodigoDeLeible() {
        return this.getCodigo();
    }

}
