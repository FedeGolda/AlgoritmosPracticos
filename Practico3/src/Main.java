//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Ejercicio nro1
        Pre: desde i = 0 hasta el largo de nombres
        Post: Retorna una matriz de string nombres
         */

        String[][] nombres = {{"Juan Rodriguez", "Martin Ocampo"}, {"María Perez", "Ignacio Castillo"}, {"Carla Gomez", "Ana Romero"}};


        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "   ");
            }
            System.out.println();
        }


        /* Ejercicio nro2
           Pre: desde i = 0 hasta el largo de matriz1
           Post: Retorna la suma y resta de las matrices
         */

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{7, 8, 9}, {10, 11, 12}};

        int suma = suma(matriz, matriz2);
        int resta = resta(matriz, matriz2);
        System.out.println("\nLa suma de los elementos de las matrices es: " + suma);
        System.out.println("\nLa resta de los elementos de las matrices es: " + resta);

        // Prueba con matrices 3x4
        int[][] matriz3x4_A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] matriz3x4_B = {
                {12, 11, 10, 9},
                {8, 6, 5, 4},
                {3, 3, 2, 1}
        };

        // Prueba con matrices 4x4
        int[][] matriz4x4_A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] matriz4x4_B = {
                {16, 15, 14, 13},
                {12, 11, 10, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1}
        };

        // Prueba con matrices 5x4
        int[][] matriz5x4_A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        int[][] matriz5x4_B = {
                {20, 19, 18, 17},
                {16, 15, 14, 13},
                {12, 11, 10, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1}
        };

        System.out.println("\nSuma de matrices 3x4: " + suma(matriz3x4_A, matriz3x4_B));
        System.out.println("Suma de matrices 4x4: " + suma(matriz4x4_A, matriz4x4_B));
        System.out.println("Suma de matrices 5x4: " + suma(matriz5x4_A, matriz5x4_B));

        System.out.println("\nResta de matrices 3x4: " + resta(matriz3x4_A, matriz3x4_B));
        System.out.println("Resta de matrices 4x4: " + resta(matriz4x4_A, matriz4x4_B));
        System.out.println("Resta de matrices 5x4: " + resta(matriz5x4_A, matriz5x4_B));

        int[][] produccion = {
                {400, 200, 50},  // Producción de modelo A: N, L, S
                {300, 100, 30}   // Producción de modelo B: N, L, S
        };

        // Matriz de recursos: filas son terminaciones y columnas son horas de taller y de administración
        double[][] recursos = {
                {25.0, 1.0},  // Recursos para terminación N: horas de taller, horas de administración
                {30.0, 1.2},  // Recursos para terminación L: horas de taller, horas de administración
                {33.0, 1.3}   // Recursos para terminación S: horas de taller, horas de administración
        };

        // Costo de la hora de taller y administración
        double costoHoraTaller = 20.0;  // Costo por hora de taller
        double costoHoraAdministracion = 15.0;  // Costo por hora de administración

        // Calcular y mostrar los costos por terminación y totales
        mostrarCostosPorTerminacion(produccion, recursos, costoHoraTaller, costoHoraAdministracion);

        encontrarMaximo(matriz);
        encontrarMinimo(matriz);
        imprimirColumnaDelMinimo(matriz);
        imprimirFilaDelMaximo(matriz);

    }

    public static int suma(int[][] m1, int[][] m2) {
        int suma = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                suma += m1[i][j] + m2[i][j];
            }
        }
        return suma;
    }

    public static int resta(int[][] m1, int[][] m2) {
        int resta = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                resta += m1[i][j] - m2[i][j];
            }
        }
        return resta;
    }

    /* Ejercicio nro 3
        Post:
        Pre:
     */


    public static void imprimirMatrizInt(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirMatrizDouble(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }


    private static void mostrarCostosPorTerminacion(int[][] produccion, double[][] recursos, double costoHoraTaller, double costoHoraAdministracion) {
        double[] totalPorTerminacion = new double[recursos.length];

        System.out.println("Terminación\tMODELO A\tMODELO B\tTOTAL");

        for (int j = 0; j < recursos.length; j++) { // Itera sobre cada terminación
            double costoModeloA = calcularCosto(produccion[0][j], recursos[j], costoHoraTaller, costoHoraAdministracion);
            double costoModeloB = calcularCosto(produccion[1][j], recursos[j], costoHoraTaller, costoHoraAdministracion);
            totalPorTerminacion[j] = costoModeloA + costoModeloB;

            char terminacion = (j == 0) ? 'N' : (j == 1) ? 'L' : 'S';
            System.out.printf("%s\t\t$%.2f\t$%.2f\t$%.2f%n", terminacion, costoModeloA, costoModeloB, totalPorTerminacion[j]);
        }

        // Suma y muestra los totales por modelo
        double totalModeloA = 0, totalModeloB = 0;
        for (double total : totalPorTerminacion) {
            totalModeloA += total / 2;  // Asumiendo que cada modelo contribuye igual al total (esto debe ajustarse si la producción afecta al total)
            totalModeloB += total / 2;
        }
        System.out.printf("TOTAL\t\t$%.2f\t$%.2f\t$%.2f%n", totalModeloA, totalModeloB, totalModeloA + totalModeloB);
    }

    public static double calcularCosto(int unidades, double[] recursos, double costoHoraTaller, double costoHoraAdministracion) {
        double costoTaller = recursos[0] * costoHoraTaller;
        double costoAdministracion = recursos[1] * costoHoraAdministracion;
        return (costoTaller + costoAdministracion) * unidades;
    }

    /* Ejercicio nro 4

     */

    public static void encontrarMaximo(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("La matriz está vacía o no es válida.");
            return;
        }

        int maxVal = matriz[0][0];
        int filaMax = 0;
        int colMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxVal) {
                    maxVal = matriz[i][j];
                    filaMax = i;
                    colMax = j;
                }
            }
        }
        System.out.println("El máximo valor es " + maxVal + " y se encuentra en la posición (" + filaMax + ", " + colMax + ")");
    }


    public static void encontrarMinimo(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("La matriz está vacía o no es válida.");
            return;
        }

        int minVal = matriz[0][0];
        int filaMin = 0;
        int colMin = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < minVal) {
                    minVal = matriz[i][j];
                    filaMin = i;
                    colMin = j;
                }
            }
        }
        System.out.println("El máximo valor es " + minVal + " y se encuentra en la posición (" + filaMin + ", " + colMin + ")");
    }


    public static void imprimirColumnaDelMinimo(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("La matriz está vacía o no es válida.");
            return;
        }

        int minVal = matriz[0][0];
        int colMin = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < minVal) {
                    minVal = matriz[i][j];
                    colMin = j;
                }
            }
        }

        System.out.println("Columna del mínimo elemento (" + minVal + "):");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][colMin]);
        }
    }


    public static void imprimirFilaDelMaximo(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("La matriz está vacía o no es válida.");
            return;
        }

        int maxVal = matriz[0][0];
        int filaMax = 0;

        // Recorremos la matriz para encontrar el máximo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxVal) {
                    maxVal = matriz[i][j];
                    filaMax = i;
                }
            }
        }

        // Imprimimos la fila que contiene el máximo
        System.out.println("Fila del máximo elemento (" + maxVal + "):");
        for (int j = 0; j < matriz[filaMax].length; j++) {
            System.out.print(matriz[filaMax][j] + " ");
        }
        System.out.println();
    }


}
