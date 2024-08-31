import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Barco[] barcos;
        float total = 0;
        int contadorBarcos = 0;
        float toneladas = 0;
        try {
            File archivo = new File("barcos.csv");
            Scanner sc = new Scanner(archivo);
            // Esta línea descarta el encabezado del archivo
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                sc.nextLine();
                contadorBarcos++;
            }
            sc.close();

            barcos = new Barco[contadorBarcos];
            int indice = 0;

            sc = new Scanner(archivo);
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] campos = linea.split(",");
                if (campos.length >= 8) {
                    String matricula = campos[0];
                    int muelle = Integer.parseInt(campos[1]);
                    float capacidad = (Float.parseFloat(campos[2])/1000);
                    float costoAlquiler = Float.parseFloat(campos[3]);
                    String id = campos[4];
                    String nombre = campos[5];
                    String apellido = campos[6];
                    int antiguedad = Integer.parseInt(campos[7]);
                    Capitan capitan = new Capitan(id, nombre, apellido, antiguedad);
                    barcos[indice] = new Barco(matricula, muelle, capacidad, costoAlquiler, capitan);
                    indice++;
                }
            }
            sc.close();
            Puerto puerto = new Puerto(contadorBarcos);
            for (int i = 0; i < contadorBarcos; i++) {
                puerto.add(barcos[i]);
            }

            for(int i = 0; i < contadorBarcos; i++){
                float numerin = barcos[i].getCostoAlquiler();
                total += numerin;
            }
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Total recaudado con todos los barcos amarrados: $" + df.format(total*15.0));

            System.out.println("Capitanes con mas de 18 años de experiencia:");
            for(int i=0;i<contadorBarcos;i++){
                if(barcos[i].getCapitan().getCapitanAntiguedad() > 17){
                    System.out.println("Barco: " + barcos[i].getMatricula() + " Capitan: " + barcos[i].getCapitan().getCapitanNombre());
                }
            }

            for (int i=0;i<contadorBarcos;i++){
                float numerin = barcos[i].getCapacidad();
                toneladas += numerin;
            }
            System.out.println("Carga promedio en toneladas de los barcos en posiciones de amarre: " + df.format(toneladas/contadorBarcos));
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
