package Modulo;

import java.util.Objects;

public class Mamifero extends Animal {

    //Atributos
    private String tipoDePelaje;
    private String habilidades;

    //Constructores


    public Mamifero(String especie, String nombre, int edad, String estadoDeSalud, String tipoDePelaje, String habilidades) {
        super(especie, nombre, edad, estadoDeSalud);
        this.tipoDePelaje = tipoDePelaje;
        this.habilidades = habilidades;
    }

    public Mamifero(){
        super();
        this.habilidades = "Sin habilidades";
        this.tipoDePelaje="Sin tipo de pelaje";
    }

    //Getters Y setters


    public String getTipoDePelaje() {
        return tipoDePelaje;
    }

    public String getHabilidades() {
        return habilidades;
    }


    // Metodos


    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Mamifero{" +
                "tipoDePelaje='" + tipoDePelaje + '\'' +
                ", habilidades='" + habilidades + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        boolean rta = false;
        if(object!= null){
            if(object instanceof Mamifero){
                Mamifero aComparar = (Mamifero) object;

                if(getNombre().equals(aComparar.getNombre())){
                    rta = true;
                }

            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public int calcularValoracion() {
        int valoracion = 30;

         if (getEstadoDeSalud().equals("regular")) {

            valoracion = valoracion*2;
        }else if(getEstadoDeSalud().equals("estupendo")) {
            valoracion = valoracion * 3;
        }
        setValoracion(valoracion);
        return valoracion;
    }
}
