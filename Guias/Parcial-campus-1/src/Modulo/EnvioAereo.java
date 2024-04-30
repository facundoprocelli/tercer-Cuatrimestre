package Modulo;

public class EnvioAereo extends EnvioDePaquetes {

    //Atributos
    private String aerolinea;


    //Constructores


    public EnvioAereo(int identificador, double peso, int destino, boolean seguro ,String tipoDeEnvio, String aerolinea) {
        super(identificador, peso, destino, seguro, tipoDeEnvio);
        this.aerolinea = aerolinea;
    }

    public  EnvioAereo(){
        super();
        this.aerolinea = "Sin aerolinea asignada";

    }

    //Getters y Setters


    public String getAerolinea() {
        return aerolinea;
    }





    // Metodos


    @Override
    public double calcularCosotAdicional() {
        double costoAdicional = getTarifa();

        if(isSeguro()){
            costoAdicional += 2500;
        }
        if(getTipoDeEnvio().equals("Express")){
            double porcentajeAdicional = (50 * costoAdicional) / 100;
            costoAdicional += porcentajeAdicional;
        }

        this.setCostoAdicional(costoAdicional);

        return costoAdicional;
    }

    @Override
    public double calcularTarifaEnvio() {
        double tarifaEnvio = getTarifa();

        tarifaEnvio = getPeso() * 30;

        if(getAerolinea().equals("AA")){
            double impuesto = (50 * tarifaEnvio) / 100;
            tarifaEnvio += impuesto;
        }
        if(getTipoDeEnvio().equals("express")){
            tarifaEnvio += 1000;
        }

        this.setTarifa(tarifaEnvio);

        return tarifaEnvio;
    }

    @Override
    public double calcularTotalPaquete() {

        double total = calcularTarifaEnvio();
        total += calcularCosotAdicional();
        return total;
    }

    // Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "EnvioAereo{" +
                "aerolinea='" + aerolinea + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if (obj != null) {
            if (obj instanceof EnvioAereo) {
                EnvioAereo aComparar = (EnvioAereo) obj;

                if(getIdentificador() == aComparar.getIdentificador() ){
                    rta = true;
                }
            }
        }
        return rta;
    }
}
