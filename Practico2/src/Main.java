import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número para verificar si es primo:");
        int n = entrada.nextInt();
        System.out.println("¿El número " + n + " es primo? " + esPrimo(n));
        System.out.println("Primo cercano: " + encontrarPrimoCercano(n));

        System.out.println("Ingrese numero para Dividendo: ");
        int dividendo = entrada.nextInt();
        System.out.println("Ingrese numero para Divisor: ");
        int divisor = entrada.nextInt();


        int[] resultado = restoYCociente(dividendo, divisor);

        System.out.println("Cociente: " + resultado[0]);
        System.out.println("Resto: " + resultado[1]);


        System.out.println("Ingrese numero para a: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese numero para b: ");
        int b = entrada.nextInt();

        System.out.println("El MCD de " + a + " y " + b + " es: " + calcularMCD(a, b));

        System.out.println("Ingrese número para Numerador: ");
        int num = entrada.nextInt();
        System.out.println("Ingrese número para Denominador: ");
        int denom = entrada.nextInt();

        System.out.println("Fracción simplificada: " + simplificarFraccion(num, denom));

        System.out.println("Ingrese numero para Capicua: ");
        int cap = entrada.nextInt();

        System.out.println("Es capicua? " + esCapicua(cap));

        CapicuasDeCincoCifras();

        int[] v = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int desde = 2, hasta = 7;
        int maximo = maximoDelVector(v, desde, hasta);
        int posicionMaximo = posicionDelMaximoDelVector(v, desde, hasta);
        System.out.println("El máximo valor entre las posiciones " + desde + " y " + hasta + " es: " + maximo);
        System.out.println("La posición del máximo valor entre las posiciones " + desde + " y " + hasta + " es: " + posicionMaximo);

        System.out.println("El promedio es: " + promedioVector(v));

        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        ordenar(arreglo);
        System.out.println("Arreglo ordenado:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }


        int[] v2 = {3, 1, 4, 1, 5, 9, 1, 2};
        int[] resultado2 = minimo(v2);


        System.out.println("El mínimo es: " + resultado2[0]);
        System.out.println("Se repite " + resultado2[1] + " veces");
        System.out.println("Aparece por primera vez en la posición: " + resultado2[2]);


        int[] v1 = {1, 3, 5, 7};

        int[] v3 = tercerVectorOrdenado(v1, v2);

        System.out.println("Vector combinado y ordenado:");
        for (int valor : v3) {
            System.out.print(valor + " ");
        }


        entrada.close();


    }

        /* Ejercicio nro 1
            Pre: si n es menor o igual que 1
            Post: Retorna el valor si es true o false
        */

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    /* Ejercicio nro 2
        Pre: mientras esPrimo sea distinto
        Post: Mostrar por pantalla el más cercano que sea mayor al propio número n.
     */

    public static int encontrarPrimoCercano(int n) {
        int numero = n + 1;
        while (!esPrimo(numero)) {
            numero++;
        }
        return numero;
    }


    /* Ejercicio nro 3
        Pre: mientras que resto sea mayor o igual divisor
        Post: Retorna cociente y resto
    */

    public static int[] restoYCociente(int dividendo, int divisor) {
        int cociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }

        return new int[]{cociente, resto};
    }

    /* Ejercicio nro 4
        Pre: mientras n mayor m
        Post: Retorna MCD
    */

    public static int calcularMCD(int m, int n) {

        if (n > m) {
            int temp = m;
            m = n;
            n = temp;
        }


        while (n != 0) {
            int resto = m % n;
            m = n;
            n = resto;
        }

        return m;

    }

    /* Ejercicio nro 5
        Pre: El numerador y denominador deben ser enteros que representan una fracción válida.
        Post: Imprime la fracción en su forma más simplificada.
     */

    public static String simplificarFraccion(int numerador, int denominador) {
        int mcd = calcularMCD(numerador, denominador);

        numerador /= mcd;
        denominador /= mcd;

        return numerador + "/" + denominador;
    }

    /* Ejercicio nro 6
        Pre: Numero sea distinto que cero.
        Post: Devuelve true si el número es capicúa y false en caso contrario.
     */

    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;

        // Invertir el número
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        return original == invertido;
    }

    /* Ejercicio nro 7
        Pre: desde i = 10000, hasta 99999.
        Post: Listar por pantalla números capicúas de 5 cifras.
     */

    public static void CapicuasDeCincoCifras() {

        for (int i = 10000; i <= 99999; i++) {
            if (esCapicua(i)) {
                System.out.println(i);
            }
        }
    }

    /* Ejercicio nro 8 a)
        Pre: desde >= 0, hasta < largo del array, desde <= hasta.
        Post: Retorna el màximo valor del array entre desde y hasta inclusive.

     */

    public static int maximoDelVector(int[] v, int desde, int hasta) {
        int maximo = 0;

        for (int i = desde + 1; i <= hasta; i++) {

            if (v[i] > maximo) {
                maximo = v[i];
            }
        }

        return maximo;
    }

    /* Ejercicio nro 8 b)
        Pre: desde >= 0, hasta < largo del array, desde <= hasta.
        Post: Retorna la posicion del maximo valor del array entre desde y hasta inclusive.
     */

    public static int posicionDelMaximoDelVector(int[] v, int desde, int hasta) {
        int maximo = v[desde];
        int posicionMaximo = desde;

        for (int i = desde + 1; i <= hasta; i++) {

            if (v[i] > maximo) {
                maximo = v[i];
                posicionMaximo = i;
            }
        }

        return posicionMaximo;
    }


    /* Ejercicio nro 9
        Pre: desde i = 0; hasta v largo del array - 1 y j = 0 v largo del array
        Post: retorna el arreglo v ordenado de menor a mayor.
     */

    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }



    /* Ejercicio nro 10 a)
        Pre: desde i = 0, hasta v largo del array.
        Post: Retorna el promedio de la suma del array.
     */

    public static double promedioVector(int[] v) {
        double suma = 0;

        for (int i : v) {
            suma += i;
        }

        return suma / v.length;
    }

        /*  Ejercicio nro 10 b)
            Pre: desde i = 1; hasta v largo del array.
            Post: Retorna el minimo, repite y posicionPrimeraVez.
         */

    public static int[] minimo(int[] v) {
        int minimo = v[0];
        int repite = 1;
        int posicionPrimeraVez = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i] < minimo) {
                minimo = v[i];
                repite = 1;
                posicionPrimeraVez = i;
            } else if (v[i] == minimo) {
                repite++;
            }
        }

        return new int[]{minimo, repite, posicionPrimeraVez};
    }

    /* Ejercicio nro 11
        Pre: Mientras i < n1 y j < n2
        Post: Retorna el array v3 conteniendo todos los elementos de v1 y v2, combinados de forma ordenada.
     */

    public static int[] tercerVectorOrdenado(int[] v1, int[] v2) {
        int n1 = v1.length;
        int n2 = v2.length;
        int[] v3 = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (v1[i] < v2[j]) {
                v3[k++] = v1[i++];
            } else {
                v3[k++] = v2[j++];
            }
        }

        while (i < n1) {
            v3[k++] = v1[i++];
        }

        while (j < n2) {
            v3[k++] = v2[j++];
        }

        return v3;
    }


}