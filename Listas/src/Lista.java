public class Lista {
    private Nodo cabeza;
    private int size = 0;

    public Lista() {
        this.cabeza = null;
    }

    public boolean esVacio() {
        return this.cabeza == null;
    }

    public void agregarInicio(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (this.esVacio()) {
            this.cabeza = nuevoNodo;
        } else {
            nuevoNodo.setSig(this.cabeza);
            this.cabeza = nuevoNodo;
        }
        size++;
    }

    public void vaciarLista() {
        this.cabeza = null;
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void imprimirLista() {
        if (esVacio()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo actual = this.cabeza;
            while (actual != null) {
                System.out.println(actual.getDato() + " ");
                actual = actual.getSig();
            }
        }
    }

}
