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


}
