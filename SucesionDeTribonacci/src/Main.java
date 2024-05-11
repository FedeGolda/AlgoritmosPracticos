public class Main {
    public static void main(String[] args) {
        int terms = 10; // Cantidad de términos que queremos imprimir
        System.out.print("Sucesion Tribonacci: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(sucesionDeTribonacci(i) + " ");
        }
        System.out.print("\n " + sucesionDeTribonacci(terms));
    }

    public static int sucesionDeTribonacci(int n) {
        if (n == 0 || n == 1) return 0;
        if (n == 2) return 1;
        return sucesionDeTribonacci(n - 1) + sucesionDeTribonacci(n - 2) + sucesionDeTribonacci(n - 3);
    }
}
