package Modulo;

public class Taxi extends Vehiculo{

    //Atributos
    private double contadorDeKM;
    private double bajadaDeBandera;
    private double precioXKM;

    //Construcotres


    public Taxi(String marca, String modelo, String tipoDeCombustible, String patente, double contadorDeKM, double bajadaDeBandera, double precioXKM) {
        super(marca, modelo, tipoDeCombustible, patente);
        this.contadorDeKM = contadorDeKM;
        this.bajadaDeBandera = bajadaDeBandera;
        this.precioXKM = precioXKM;
    }

    //Getters y Setters


    public double getContadorDeKM() {
        return contadorDeKM;
    }

    public double getBajadaDeBandera() {
        return bajadaDeBandera;
    }

    public double getPrecioXKM() {
        return precioXKM;
    }

    private void setContadorDeKM(double contadorDeKM) {
        this.contadorDeKM = contadorDeKM;
    }

    // Metodos


    @Override
    public double calcularTarifa(double distancia) {
        return bajadaDeBandera + (distancia * precioXKM);
    }

    public double actualizarKilometraje(double distancia){

        return contadorDeKM = getContadorDeKM() + distancia;

    }

    // Sobreescritura


    @Override
    public String toString() {
        return super.toString() + "Taxi{" +
                "contadorDeKM=" + contadorDeKM +
                ", bajadaDeBandera=" + bajadaDeBandera +
                ", precioXKM=" + precioXKM +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
       boolean rta = false;
        if(obj != null){
            if(obj instanceof Taxi){
                Taxi aComparar = (Taxi) obj;

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
