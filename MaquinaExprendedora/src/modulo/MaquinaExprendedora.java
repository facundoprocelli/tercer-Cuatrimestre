package modulo;

public class MaquinaExprendedora {

    //Atributos
    private double precio;
    private double saldo;
    private double recaudacion;
    private double vuelto;
    private int cantBoletosDisponibles;
    private int boletosVendidos;
    private boolean estado;

    // Constructores


    public MaquinaExprendedora() {
        this.precio = 10;
        this.saldo = 0;
        this.recaudacion = 0;
        this.cantBoletosDisponibles= 10;
        this.boletosVendidos = 0;
        this.estado = true;

    }

    public MaquinaExprendedora(double precio, int cantBoletosDisponibles){
        this.precio = precio;
        this.saldo = 0;
        this.recaudacion = 0;
        this.cantBoletosDisponibles = cantBoletosDisponibles;
        this.boletosVendidos = 0;
        this.estado = true;
    }

    public MaquinaExprendedora(int precio, int saldo, int recaudacion, int cantBoletosDisponibles, int boletosVendidos) {
        this.precio = precio;
        this.saldo = saldo;
        this.recaudacion = recaudacion;
        this.cantBoletosDisponibles = cantBoletosDisponibles;
        this.boletosVendidos = boletosVendidos;
        this.estado = true;
    }

    // Getters y Setters


    public double getRecaudacion() {
        return recaudacion;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCantBoletosDisponibles(int cantBoletosDisponibles) {
        this.cantBoletosDisponibles = cantBoletosDisponibles;
    }

    public int getCantBoletosDisponibles() {
        return cantBoletosDisponibles;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }

    public boolean isEstado(){
        return  estado;
    }



    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    // Metodos

    public void introducirDinero( double dinero){
        if(dinero > 0)
        saldo += dinero;

    }

    public double getVuelto(){
        return vuelto;
    }


    // Metodo para imprimir el boleto
    public  Boleto imprimir(){
        Boleto miBoleto = null;

        if((cantBoletosDisponibles > 0) && (saldo >= precio)){

                miBoleto = new Boleto(precio, boletosVendidos);

                darVuelto();
                recaudacion += precio;
                cantBoletosDisponibles--;
                boletosVendidos++;
                reiniciarSaldo();
        }
        return miBoleto;
    }

    // Metodo para calcular el vuelto

    private void darVuelto(){

        saldo -= precio;

        if(saldo > 0.05){
            vuelto = saldo;
        }else {
            recaudacion += saldo;
        }
    }


    // Metodos para reinicar parametros de la maquina exprendedora
    private void reiniciarSaldo(){
        saldo = 0;
    }

    public   void reiniciarVuelto(){
        vuelto = 0;
    }

    private void vaciarMaquina(){
        this.recaudacion = 0;
    }


    // Metodo para retirar dinero
    public String retirarDinero(){
        double recaudacion = this.recaudacion;
        vaciarMaquina();
        return "Acaba de retirar un total de " + recaudacion + " y el saldo esta en 0";
    }


    // Metodo para cambiar el estado de la maquina
    public void cambiarEstado(){
        if(this.isEstado())
            this.setEstado(false);
        else this.setEstado(true);
    }


    // Metodo para conocer el estado de la maquina
    public String recibirEstado() {

        String mensaje= "s";

        if (estado){
            mensaje = "Activa";
        }else {
            mensaje = "Inactiva";
        }
        return mensaje;
    }
}
