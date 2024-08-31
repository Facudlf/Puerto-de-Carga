import java.util.Arrays;

public class Puerto {
    private Barco[] barcos;
    private int count;

    public Puerto(int capacidad) {
        barcos = new Barco[capacidad];
        count = 0;
    }

    public void add(Barco barco) {
        if (count < barcos.length) {
            barcos[count] = barco;
            count++;
        } else {
            System.out.println("El puerto está lleno. No se puede agregar más barcos.");
        }
    }

    public Barco[] getBarcos() {
        return barcos;
    }

    public void setBarcos(Barco[] barcos) {
        this.barcos = barcos;
    }

    public void mostrarBarcos() {
        for (Barco barco : barcos) {
            if (barco != null) {
                System.out.println(barco);
            }
        }
    }
}
