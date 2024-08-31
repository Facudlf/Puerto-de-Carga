public class Barco {
    private String matricula;
    private int muelle;
    private float capacidad;
    private float costoAlquiler;
    private Capitan capitan;

    public Barco(String matricula, int muelle, float capacidad, float costoAlquiler, Capitan capitan) {
        this.matricula = matricula;
        this.muelle = muelle;
        this.capacidad = capacidad;
        this.costoAlquiler = costoAlquiler;
        this.capitan = capitan;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getMuelle() {
        return muelle;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public float getCostoAlquiler() {
        return costoAlquiler;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", muelle=" + muelle +
                ", capacidad=" + capacidad +
                " Toneladas, costoAlquiler=" + costoAlquiler +
                ", capitan=" + capitan.getCapitanNombre() +
                '}';
    }
}
