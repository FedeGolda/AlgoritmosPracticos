import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int numeroSumatoria = 2;
        System.out.println("Sumatoria de " + numeroSumatoria + ": " + Sumatoria(numeroSumatoria));

        int[] vector = {1, 2};
        System.out.println("Sumatoria del vector " + Arrays.toString(vector) + ": " + SumatoriaVector(vector, vector.length - 1));

        int baseMultiplicar = 2, multiplicador = 10;
        System.out.println("Multiplicación de " + baseMultiplicar + " * " + multiplicador + ": " + Multiplicar(baseMultiplicar, multiplicador));

        int numeroFactorial = 5;
        System.out.println("Factorial de " + numeroFactorial + ": " + Factorial(numeroFactorial));

        listar(5);
        listar2(5);

        int[] vector2 = {5, 2, 8, 3, 1};
        int minimo = ValorMinimo(vector2, vector2.length - 1);
        System.out.println("El valor mínimo es: " + minimo);

        int numF = 5;
        System.out.println("Fibonacci de " + numF + ": " + Fibonacci(numF));
    }

    public static int Sumatoria(int n) {
        if (n == 1)
            return 1;
        return n + Sumatoria(n - 1);
    }

    public static int SumatoriaVector(int[] v, int i) {
        if (i == 0)
            return v[0];
        return v[i] + SumatoriaVector(v, i - 1);
    }

    public static int Multiplicar(int n, int m) {
        if (m == 0)
            return 0;
        else if (m == 1)
            return n;
        return n + Multiplicar(n, m - 1);
    }

    // PRE: n > 0

    public static int Factorial(int n) {
        if (n == 0)
            return 1;
        return n * Factorial(n - 1);
    }

    public static void listar(int n) {
        if (n > 0)
            listar(n - 1);

        System.out.println(n);
    }

    public static void listar2(int n) {
        System.out.println(n);
        if (n > 0)
            listar(n - 1);
    }


    public static int ValorMinimo(int[] v, int i) {
        if (i == 0) {
            return v[0];
        } else {
            int minResto = ValorMinimo(v, i - 1);
            if (v[i] < minResto) {
                return v[i];
            } else {
                return minResto;
            }
        }
    }


    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return (Fibonacci(n - 1) + Fibonacci(n - 2));
    }


}
