import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 1;  // Aquí puedes poner scanner.nextInt() para leer el número del usuario.

        System.out.println("Tabla de multiplicar del número " + numero + ":");
        imprimirTabla(numero);  // Llamar al método para imprimir la tabla
        scanner.close();

    }

    public static void imprimirTabla(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // PRE: m.length > 0
    // POST: devuelve la suma de los sueldos

    public static float registroSueldos(int[][] m) {
        float totalSueldo = 0;
        for (int i = 0; i < m.length; i++) {
            totalSueldo += m[i][2];
        }
        return totalSueldo;
    }

    public static double porcentaje(int[][] m) {
        float conteoSueldosAltos = 0;
        for (int i = 0; i < m.length; i++) {
            if(m[i][2] >= 25000){
                conteoSueldosAltos++;
            }
        }
        return conteoSueldosAltos / m.length * 100;
    }


}
