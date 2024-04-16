//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Ejercicio nro1
        Pre:
        Post:
         */

        String[][] nombres = {{"Juan Rodriguez", "Martin Ocampo"}, {"María Perez", "Ignacio Castillo"}, {"Carla Gomez", "Ana Romero"}};


        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "   ");
            }
            System.out.println();
        }

        


    }
}
