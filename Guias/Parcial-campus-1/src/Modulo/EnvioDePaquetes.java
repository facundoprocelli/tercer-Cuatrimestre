package Modulo;
/*
e tierra
El peso del paquete * 25$. Si es “camión” el tipo de vehículo +10%. Si la distancia es superior a los 100km, por cada kilómetro adicional, +5%
Paquete aire
El peso del paquete * 30$. Si la aerolínea es AA, sumaría un 50% de impuestos. Y si es express, +1000$ fijos.
Método calcularCostoAdicional para los servicios adicionales. Si tiene seguro el costo es un adicional de 1500$ para los paquetes que viajan por tierra y 2500$ para los paquetes que viajan por aire. Si dispone de entrega en el mismo día +25% para tierra y 50% para los paquetes que viajan por avión.
Método calcularTota

 */
public abstract class EnvioDePaquetes {

    //Atributos
    private int identificador;
    private double peso;
    private int  destino;
    private boolean seguro;
    private  double tarifa;
    private double costoAdicional;
    private String tipoDeEnvio;

    private boolean enviado;

    //Constructores

    public EnvioDePaquetes(int identificador, double peso, int destino, boolean seguro, String tipoDeEnvio) {
        this.identificador = identificador;
        this.peso = peso;
        this.destino = destino;
        this.seguro = seguro;
        this.tipoDeEnvio = tipoDeEnvio;
        this.costoAdicional = 0;
        this.tarifa = 0;
        this.enviado = false;
    }

    public EnvioDePaquetes() {
        this.peso = 0;
        this.destino = 0;
        this.seguro = false;
        this.tarifa = 0;
        this.costoAdicional = 0;
        this.enviado = false;
        this.tipoDeEnvio = "estandar";
        this.identificador = -1;
    }



    // Getters y Setters


    public String getTipoDeEnvio() {
        return tipoDeEnvio;
    }

    public double getPeso() {
        return peso;
    }

    public int getDestino() {
        return destino;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public double getTarifa() {
        return tarifa;
    }

    protected void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    protected void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public double getCostoAdicional() {
        return costoAdicional;
    }

    public boolean isEnviado() {
        return enviado;
    }



    // Metodos

    public abstract double calcularTarifaEnvio();

    public abstract double calcularTotalPaquete();
    public abstract double calcularCosotAdicional();


    //Sobreescrituras


    @Override
    public String toString() {
        return "EnvioDePaquetes{" +
                "identificador=" + identificador +
                ", peso=" + peso +
                ", destino=" + destino +
                ", seguro=" + seguro +
                ", tarifa=" + tarifa +
                ", costoAdicional=" + costoAdicional +
                ", tipoDeEnvio='" + tipoDeEnvio + '\'' +
                ", enviado=" + enviado +
                '}';
    }
}
