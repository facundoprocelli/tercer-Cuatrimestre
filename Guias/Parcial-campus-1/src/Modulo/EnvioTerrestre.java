package Modulo;

public class EnvioTerrestre extends EnvioDePaquetes {


    //Atributos
    private double distancia;
    private String tipoDeVehiculo;

    //Constructores


    public EnvioTerrestre(int identificador, double peso, int destino, boolean seguro, String tipoDeEnvio, double distancia, String tipoDeVehiculo) {
        super(identificador, peso, destino, seguro, tipoDeEnvio);
        this.distancia = distancia;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public EnvioTerrestre() {
        super();
        this.distancia = 0;
        this.tipoDeVehiculo = "Sin vehiculo asignado";
    }

    //Getters y setters


    public double getDistancia() {
        return distancia;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    //Metodos

    @Override
    public double calcularTotalPaquete() {

        return calcularCosotAdicional() + calcularTarifaEnvio();
    }

    @Override
    public double calcularCosotAdicional() {
        double costoAdicional = getTarifa();

        if(isSeguro()){
            costoAdicional += 1500;
        }

        if(getTipoDeVehiculo().equals("camion")){
            double porcentajeAdicional = (25 * costoAdicional) /100;
            costoAdicional += porcentajeAdicional;
        }
        setCostoAdicional(costoAdicional);

        return costoAdicional;
    }

    @Override
    public double calcularTarifaEnvio() {
        double tarifaEnvio = 0;

        tarifaEnvio = getPeso() * 25;
        if(getTipoDeVehiculo().equals("camion")){
            double porcentajeAumento = (10 * tarifaEnvio) / 100;
            tarifaEnvio+= porcentajeAumento;
        }

        if(getDestino() > 100){
            double kmAdiconales = getDestino() - 100;
            double porcentajeExtra = 0;
            for(int i = 0; i < kmAdiconales; i++){

                porcentajeExtra = (5 * tarifaEnvio) / 100;
                tarifaEnvio+= porcentajeExtra;
            }

        }

        setTarifa(tarifaEnvio);
            return tarifaEnvio;

    }

    @Override
    public String toString() {
        return super.toString() + "EnvioTerrestre{" +
                "distancia=" + distancia +
                ", tipoDeVehiculo='" + tipoDeVehiculo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if (obj != null) {
            if (obj instanceof EnvioTerrestre) {
                EnvioTerrestre aComparar = (EnvioTerrestre) obj;

                if(getIdentificador() == aComparar.getIdentificador() ){
                    rta = true;
                }
            }
        }
        return rta;
    }
}


