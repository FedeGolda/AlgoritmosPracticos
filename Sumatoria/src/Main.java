public class Main {
    public static void main(String[] args) {
        System.out.println("Sumatoria: " + Sumatoria(2));
        int[] vector = {1,2};
        System.out.println("Sumatoria con Vector: " + SumatoriaVector(vector, vector.length - 1));
        System.out.println("Multiplicacion: " + Multiplicar(2,10));
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
        if (n == 0 && m == 0)
            return 0;
        return n + Multiplicar(n, m - 1);
    }

}
