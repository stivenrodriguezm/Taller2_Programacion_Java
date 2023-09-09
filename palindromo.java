import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa un número entero:");
        String numero = lector.nextLine();

        char[] array1 = numero.toCharArray();
        char[] array2 = new char[array1.length];

        int cantidad = array1.length;
        int index = cantidad;

        for (char c : array1) {
            index = index - 1;
            char valor = array1[index];
            array2[index] = valor;
        }

        if (new String(array1).equals(new String(array2))) {
            System.out.println(numero + " es un número Palindromo");
        } else {
            System.out.println(numero + " no es un número palindromo");
        }
    }
}
