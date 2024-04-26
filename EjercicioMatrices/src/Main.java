import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner

        int[][] matriz = new int[4][4];
/*
        // Inicialización de la matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = 8;
        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;
        matriz[2][3] = 12;
        matriz[3][0] = 13;
        matriz[3][1] = 14;
        matriz[3][2] = 15;
        matriz[3][3] = 16;
*/


        int opcion;

        do {

            System.out.flush();
            System.out.println("\n************* MENU ***************************");
            System.out.println("* 1. Ingresar valores a la matriz            *");
            System.out.println("* 2. Sumar fila                              *");
            System.out.println("* 3. Sumar columna                           *");
            System.out.println("* 4. Sumar diagonal principal                *");
            System.out.println("* 5. Sumar diagonal inversa principal        *");
            System.out.println("* 6. Media de todos los valores de la matriz *");
            System.out.println("* 7. Salir                                   *");
            System.out.println("**********************************************");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Por favor, ingrese los valores enteros para la matriz:");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            boolean entradaValida = false;
                            do {
                                try {
                                    System.out.print("Ingrese el valor para [" + (i+1) + "][" + (j+1) + "]: ");
                                    matriz[i][j] = scanner.nextInt();
                                    entradaValida = true;  // Si se llega a esta línea, la entrada fue válida
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Por favor, ingrese solo números enteros.");
                                    scanner.nextLine(); // Limpia el buffer del scanner para evitar loops infinitos
                                }
                            } while (!entradaValida);
                        }
                    }
                    break;


                case 2:
                    System.out.print("Ingrese el número de fila a sumar (1-4): ");
                    int fila = scanner.nextInt();
                    if (fila < 1 || fila > 4) {
                        System.out.println("Número de fila inválido.");
                    } else {
                        int suma = sumarFila(matriz, fila - 1);
                        System.out.println("La suma de la fila " + fila + " es: " + suma);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el número de columna a sumar (1-4): ");
                    int columna = scanner.nextInt();
                    if (columna < 1 || columna > 4) {
                        System.out.println("Número de columna inválido.");
                    } else {
                        int suma = sumarColumna(matriz, columna - 1);
                        System.out.println("La suma de la columna " + columna + " es: " + suma);
                    }
                    break;

                case 4:
                    System.out.println("La suma de la diagonal principal es: " + sumarDiagonalPrincipal(matriz));
                    break;

                case 5:
                    System.out.println("La suma de la diagonal inversa principal es: " + sumarDiagonalInversa(matriz));
                    break;

                case 6:
                    System.out.println("La media de todos los valores de la matriz es: " + calcularMedia(matriz));
                    break;

                case 7:
                    System.out.println("Saliendo...\nGRACIAS POR USAR EL PROGRAMA! :D");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }


    public static int sumarFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz[columna].length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int sumarDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }

    public static double calcularMedia(int[][] matriz) {
        int suma = 0;
        int totalElementos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                totalElementos++;
            }
        }
        return (double) suma / totalElementos;
    }

}
