//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.agregarInicio(1);
        lista1.agregarInicio(2);
        lista1.agregarInicio(3);

        lista1.imprimirLista();
        
        System.out.println(lista1.getSize());

        lista1.vaciarLista();

        lista1.imprimirLista();

        System.out.println(lista1.getSize());

    }
}