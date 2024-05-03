package Modulo;

public class General extends Entrada{

    //Atributos
    private String zona;

    //Construcotr


    public General(int id, double precio, String zona) {
        super(id, precio);
        this.zona = zona;
    }

    //Getters y setters


    public String getZona() {
        return zona;
    }


    @Override
    public String obtenerTipo() {
        return "General";
    }

    @Override
    public double obtenerPrecioTotal(double precio) {
        return precio;
    }

    //Sobreescrituras
    @Override
    public String toString() {
        return super. toString() + "General{" +
                "zona='" + zona + '\'' +
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
