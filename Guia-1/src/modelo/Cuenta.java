package modelo;

public class Cuenta {

    private double saldo;
    private int movimientos;


    public Cuenta(){
        this.saldo = 0;
        this.movimientos = 0;
    }

    public Cuenta(double p_saldo, int p_movimientos) {
        this.saldo = p_saldo;
        this.movimientos = p_movimientos;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }
    public int getMovimientos() {
        return movimientos;
    }

    //Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    // Metodos

    public String getInfo(){
        return"El cliente cuenta con un saldo total de " + getSaldo() + " y realizó "+ movimientos + " operaciones";
    }


    public void extraerDinero(double  nuevoSaldo){

        double p_saldo = getSaldo();
         setSaldo(p_saldo - nuevoSaldo);
    }

    public void depositarDinero(double nuevoSaldo){
        double p_saldo = getSaldo();
        setSaldo(p_saldo + nuevoSaldo);
    }

    public String mostrarSaldo(){
        return "El saldo disponible es: " + getSaldo();
    }
}
