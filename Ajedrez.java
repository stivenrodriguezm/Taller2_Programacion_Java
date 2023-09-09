
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la fila del caballo");
        int fila = scanner.nextInt();
        System.out.println("Ingresa la columna del caballo");
        int columna = scanner.nextInt();

        ArrayList<String> posiblesSalidas = new ArrayList<>();

        if ((1 <= fila && fila <= 8) && (1 <= columna && columna <= 8)) {
            // Posibles movimientos verticales
            if ((fila == 1 || fila == 2) && (2 <= columna && columna <= 7)) {
                int nuevaFila = fila + 2;
                int nuevaColumna1 = columna + 1;
                int nuevaColumna2 = columna - 1;
                posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
                posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna2 + ")");
            } else if ((fila == 1 || fila == 2) && (columna == 1 || columna == 8)) {
                int nuevaFila = fila + 2;
                if (columna == 1) {
                    int nuevaColumna1 = columna + 1;
                    posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
                } else if (columna == 8) {
                    int nuevaColumna1 = columna - 1;
                    posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
                }
            }

            if ((fila == 8 || fila == 7) && (2 <= columna && columna <= 7)) {
                int nuevaFila = fila - 2;
                int nuevaColumna1 = columna + 1;
                int nuevaColumna2 = columna - 1;
                posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
                posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna2 + ")");
            } else if ((fila == 8 || fila == 7) && (columna == 1 || columna == 8)) {
                int nuevaFila = fila - 2;
                if (columna == 1) {
                    int nuevaColumna1 = columna + 1;
                    posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
                } else if (columna == 8) {
                    int nuevaColumna1 = columna - 1;
                    posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
                }
            }

            if (3 <= fila && fila <= 6 && (2 <= columna && columna <= 7)) {
                int nuevaFila1 = fila + 2;
                int nuevaFila2 = fila - 2;
                int nuevaColumna1 = columna + 1;
                int nuevaColumna2 = columna - 1;
                posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna1 + ")");
                posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna2 + ")");
                posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna1 + ")");
                posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna2 + ")");
            } else if (3 <= fila && fila <= 6 && columna == 1) {
                int nuevaFila1 = fila + 2;
                int nuevaFila2 = fila - 2;
                int nuevaColumna1 = columna + 1;
                posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna1 + ")");
                posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna1 + ")");
            } else if (3 <= fila && fila <= 6 && columna == 8) {
                int nuevaFila1 = fila + 2;
                int nuevaFila2 = fila - 2;
                int nuevaColumna1 = columna - 1;
                posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna1 + ")");
                posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna1 + ")");
            }

            // Posibles movimientos horizontales
            if ((columna == 1 || columna == 2) && (2 <= fila && fila <= 7)) {
                int nuevaColumna = columna + 2;
                int nuevaFila1 = fila + 1;
                int nuevaFila2 = fila - 1;
                posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna + ")");
                posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna + ")");
            } else if ((columna == 1 || columna == 2) && (fila == 1 || fila == 8)) {
                int nuevaColumna = columna + 2;
                if (columna == 1) {
                    int nuevaFila1 = fila + 1;
                    posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna + ")");
                } else if (columna == 8) {
                    int nuevaFila2 = fila - 1;
                    posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna + ")");
                }
            }

            if ((columna == 8 || columna == 7) && (2 <= fila && fila <= 7)) {
                int nuevaColumna = columna - 2;
                int nuevaFila1 = fila + 1;
                int nuevaFila2 = fila - 1;
                posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna + ")");
                posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna + ")");
            } else if ((columna == 8 || columna == 7) && (fila == 1 || fila == 8)) {
                int nuevaColumna = columna - 2;
                if (columna == 1) {
                    int nuevaFila = fila + 1;
                    posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna + ")");
                } else if (columna == 8) {
                    int nuevaFila = fila - 1;
                    posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna + ")");
                }
            }

            if (3 <= columna && columna <= 6 && (2 <= fila && fila <= 7)) {
                int nuevaColumna1 = columna + 2;
                int nuevaColumna2 = columna - 2;
                int nuevaFila1 = fila + 1;
                int nuevaFila2 = fila - 1;
                posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna1 + ")");
                posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna2 + ")");
            }
        } else if (3 <= columna && columna <= 6 && fila == 1) {
            int nuevaFila = fila + 1;
            int nuevaColumna1 = columna + 2;
            int nuevaColumna2 = columna - 2;
            posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
            posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna2 + ")");
        } else if (3 <= columna && columna <= 6 && fila == 8) {
            int nuevaFila = fila - 1;
            int nuevaColumna1 = columna + 2;
            int nuevaColumna2 = columna - 2;
            posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
            posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
        }

        System.out.println("Fila, Columna");
        for (String movimiento : posiblesSalidas) {
            System.out.println(movimiento);
        }
    } else {
        System.out.println("Error: Posición inválida.");
    }
}

posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna1 + ")");
        posiblesSalidas.add("(" + nuevaFila1 + ", " + nuevaColumna2 + ")");
        posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna1 + ")");
        posiblesSalidas.add("(" + nuevaFila2 + ", " + nuevaColumna2 + ")");
        } else if (3 <= columna && columna <= 6 && fila == 1) {
        int nuevaFila = fila + 1;
        int nuevaColumna1 = columna + 2;
        int nuevaColumna2 = columna - 2;
        posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
        posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna2 + ")");
        } else if (3 <= columna && columna <= 6 && fila == 8) {
        int nuevaFila = fila - 1;
        int nuevaColumna1 = columna + 2;
        int nuevaColumna2 = columna - 2;
        posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
        posiblesSalidas.add("(" + nuevaFila + ", " + nuevaColumna1 + ")");
        }

        System.out.println("Fila, Columna");
        for (String movimiento : posiblesSalidas) {
        System.out.println(movimiento);
        }
        } else {
        System.out.println("Error: Posición inválida.");
        }
        }
        }
