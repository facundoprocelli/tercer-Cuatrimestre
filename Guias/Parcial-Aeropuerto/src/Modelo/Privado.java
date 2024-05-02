package Modelo;

import Interfaces.IOtrosVuelos;
import Interfaces.IServiciosExtra;

import java.math.MathContext;

public class Privado extends  Avion implements IServiciosExtra {

    //Atributos
    private boolean jacuzzi;
    private String claveWiFi;

    //Construcotor


    public Privado(String nombre, String marca, double capacidadDeCombustible, String tipoDeMotor, int cantidadDeAsientos, boolean jacuzzi, String claveWiFi, String patente) {
        super(nombre, marca, capacidadDeCombustible, tipoDeMotor, cantidadDeAsientos, patente);
        this.jacuzzi = jacuzzi;
        this.claveWiFi = claveWiFi;
    }

    //Getters y Settters


    public String getClaveWiFi() {
        return claveWiFi;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    private void setClaveWiFi(String claveWiFi) {
        this.claveWiFi = claveWiFi;
    }

    @Override
    public String despegar() {
        return "Carreteando.. fsshhhhhhh";
    }

    @Override
    public String aterrizar() {
        return "Acomodenser y preparence para el descenso ";
    }

    @Override
    public String volar() {
        return "Estamos volando a 5000 pies";
    }

    @Override
    public String servicioDeComida() {
        return "Caviar o Pulpo?";
    }

    @Override
    public String darManta() {
        return "Aqui tiene su manta de lana Austriaca";
    }

    @Override
    public String toString() {
        return super.toString() + "Privado{" +
                "jacuzzi=" + jacuzzi +
                ", claveWiFi='" + claveWiFi + '\'' +
                '}';
    }

    public boolean verMundial(){
        boolean rta = false;

        if(Math.floor(Math.random() * 1) == 1) {
            rta = true;
        }

        return rta;
    }


    @Override
    public boolean equals(Object obj) {
        boolean rta= false;

        if(obj != null){
            if(obj instanceof Privado){
                Privado aComparar = (Privado) obj;
                if(getPatente().equals(aComparar.getPatente())){
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

}
