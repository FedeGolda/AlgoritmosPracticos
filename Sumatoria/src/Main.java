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

    public static int Factorial(int n){
        if(n == 0)
            return 1;
        return n * Factorial(n - 1);
    }
}
