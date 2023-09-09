
import java.util.ArrayList;
import java.util.Scanner ;

    public class histograma {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int valor = 1;
            ArrayList<String> positivos = new ArrayList<String>();
            ArrayList<String> negativos = new ArrayList<String>();

            while (valor != 0) {
                System.out.println("Ingresa un valor entero:");
                valor = lector.nextInt();

                if (valor > 0) {
                    positivos.add("*");
                } else if (valor < 0) {
                    negativos.add("*");
                }
            }

            System.out.print("Positivos: ");
            for (String i : positivos) {
                System.out.print(i + " ");
            }

            System.out.print("\nNegativos: ");
            for (String i : negativos) {
                System.out.print(i + " ");
            }
        }
    }
