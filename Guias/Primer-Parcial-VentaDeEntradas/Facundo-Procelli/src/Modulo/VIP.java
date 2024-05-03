package Modulo;

public class VIP extends Entrada{

    //Atributo
    private String beneficio;

    //Constructor


    public VIP(int id, double precio, String beneficio) {
        super(id, precio);
        this.beneficio = beneficio;
    }

    // Getters y Setters


    public String getBeneficio() {
        return beneficio;
    }

    //Metodos
    @Override
    public String obtenerTipo() {
        return "VIP";
    }

    @Override
    public double obtenerPrecioTotal(double precio) {
        double porcentaje = ((50 * precio) / 100);
        double precioEntrada = precio + porcentaje;
        return precioEntrada;
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "VIP{" +
                "beneficio='" + beneficio + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;

        if(obj != null){
            if(obj instanceof  General){
                General aComaprar = (General) obj;

                if(getId() == aComaprar.getId()){
                    rta = true;
                }
            }
        }
        return rta;
    }

}
