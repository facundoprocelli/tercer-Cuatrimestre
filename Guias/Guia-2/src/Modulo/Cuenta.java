package Modulo;

public class Cuenta {

    //Atributos
    private float saldo;

    //Constructores

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public Cuenta(){
        this.saldo = 0;
    }


    //Getters Y Setters

    public float getSaldo() {
        return saldo;
    }


    // Metodos

    public void ingresar(float saldo){
        this.saldo += saldo;
    }

    public void extraer(float saldo){
        if(saldo < getSaldo()){
            this.saldo -=  saldo;
        }
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return "El saldo es: " + getSaldo();
    }
}
