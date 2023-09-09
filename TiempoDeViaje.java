import java.util.Scanner;

public class TiempoDeViaje {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int tiempo = 1;
        int suma = 0;

        while (tiempo != 0) {
            System.out.println("Duración tramo:");
            tiempo = lector.nextInt();
            if (tiempo >= 0) {
                suma += tiempo;
            } else {
                System.out.println("Ingresa un tiempo válido, en minutos.");
            }
        }

        int horas = suma / 60;
        int minutos = suma % 60;

        if (minutos >= 10) {
            System.out.println("Tiempo total del viaje: " + horas + ":" + minutos + " horas");
        } else {
            System.out.println("Tiempo total del viaje: " + horas + ":0" + minutos + " horas");
        }
    }
}
