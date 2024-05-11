//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 5;

        System.out.println("Numero de Pell: " + numeroDePell(n));

    }


    public static int numeroDePell(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return 2 * numeroDePell(n - 1) + numeroDePell(n - 2);
    }

}