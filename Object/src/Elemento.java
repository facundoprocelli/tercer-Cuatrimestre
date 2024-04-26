public abstract class Elemento implements Comparable {

    private String titulo;
    private int id;


    public Elemento(int id ,String titulo) {
        this.titulo = titulo;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo();
        //return super.toString(); // Aca es como si no hiciese nada
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales = false;

        if(obj != null){ // Si es nulo
                // Siempre que hay un casteo antes debe haber un instance of
            if(obj instanceof Elemento) { // Comporbación de tipo
                Elemento aComprar = (Elemento) obj; //Casteo

                if (getId() == aComprar.getId()) { // comparo
                    sonIguales = true;
                }
            }
        }
        return sonIguales;
    }

    @Override
    public int compareTo(Object obj) { // Sobrecargando este metodo decidimos como se compara

        int rta = 0;
        if(obj != null){
            if (obj instanceof Elemento){
                Elemento elemento = (Elemento)obj;

                if(getId()> elemento.getId()){ // Se usan los mismos parametros
                    rta = 1;
                }
                else if(getId()< elemento.getId()){
                    rta = -1;
                }
                else if (getId() == elemento.getId()){
                    rta = 0;
                }
            }
        }
        return rta;
    }


    @Override
    public int hashCode() { // Esto se hace porque el add del set tiene un or
                        //  de hascode o equals, entonces si le damos un valor al hascode, se ejecuta el equals
        return 1;
    }
}
