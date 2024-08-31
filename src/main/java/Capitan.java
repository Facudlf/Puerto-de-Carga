public class Capitan {
    private String capitanId;
    private String capitanNombre, capitanApellido;
    private int capitanAntiguedad;

    public Capitan(String capitanId, String capitanNombre, String capitanApellido, int capitanAntiguedad){
        this.capitanId = capitanId;
        this.capitanNombre = capitanNombre;
        this.capitanApellido = capitanApellido;
        this.capitanAntiguedad = capitanAntiguedad;
    }

    public String getCapitanId() {
        return capitanId;
    }

    public String getCapitanNombre() {
        return capitanNombre;
    }

    public String getCapitanApellido() {
        return capitanApellido;
    }

    public int getCapitanAntiguedad() {
        return capitanAntiguedad;
    }

    @Override
    public String toString() {
        return "Capitan{" +
                "capitanId='" + capitanId + '\'' +
                ", capitanNombre='" + capitanNombre + '\'' +
                ", capitanApellido='" + capitanApellido + '\'' +
                ", capitanAntiguedad=" + capitanAntiguedad +
                '}';
    }
}
