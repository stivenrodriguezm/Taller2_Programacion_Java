
import java.util.Random;
import java.util.Scanner;

    public class AdivinaUnNumero {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            Random generadorAleatorio = new Random();

            boolean adivinado = false;
            int mayor = 100;
            int menor = 0;
            int intentos = 0;
            int aleatorio = generadorAleatorio.nextInt(mayor + 1);

            while (!adivinado) {
                System.out.println("Ingresa un número entre " + menor + " y " + mayor);
                int intento = lector.nextInt();
                intentos++;

                if (intento == aleatorio) {
                    System.out.println("¡Adivinaste! Fueron " + intentos + " intentos");
                    adivinado = true;
                } else if (intento > aleatorio) {
                    mayor = intento;
                    System.out.println("Menos");
                } else {
                    menor = intento;
                    System.out.println("Más");
                }
            }

            System.out.println("Fin del juego...");
        }
    }
