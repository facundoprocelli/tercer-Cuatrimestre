package Modulo;

public class EComision extends  Empleado{

    //Atributos
    private int clientesCaptados;
    private Double montoXCliente;

    // Constructores


    public EComision(String DNI, String nombre, String apellido, int antiguedad, int clientesCaptados, double montoXCliente) {
        super(DNI, nombre, apellido, antiguedad, 0);
        this.clientesCaptados = clientesCaptados;
        this.montoXCliente = montoXCliente;
    }

    public EComision(){
        super("Sin DNI", "Sin Nombre", "Sin Apellido", -1, 0);
        this.clientesCaptados = 0;
        this.montoXCliente = 0.0;

    }

    // Getters y Setters

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public double getMontoXCliente() {
        return montoXCliente;
    }

    public void setMontoXCliente(double montoXCliente){
        this.montoXCliente = montoXCliente;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }
    // Metodos

    @Override
    public double obtenerSalario() {

        double salario = getClientesCaptados() * getMontoXCliente();

        if(salario < 750){
            salario = 750;
        }
        return salario;
    }


    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "EComision{" +
                "clientesCaptados=" + clientesCaptados +
                ", montoXCliente=" + montoXCliente +
                '}' + "\n";
    }
}
