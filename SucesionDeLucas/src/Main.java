//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 3;  // Cambia este valor para probar con diferentes valores de n
        System.out.println("Sucesión de Lucas (Recursiva) para n = " + n + ": " + SucesionLucas(n));
        System.out.println("Sucesión de Lucas (Iterativa) para n = " + n + ": " + SucesionLucasIterativa(n));

    }


    public static int SucesionLucas(int n) {
        if (n == 0)
            return 2;  // Caso base para L_0
        if (n == 1)
            return 1;  // Caso base para L_1

        return SucesionLucas(n-1) + SucesionLucas(n-2);
    }

    public static int SucesionLucasIterativa(int n) {
        if (n == 0) return 2;
        if (n == 1) return 1;

        int a = 2, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }


}