public class Nodo {
    private Object dato;

    private Nodo sig;

    public Nodo (Object dato) {
        this.dato = dato;
        this.sig = null;
    }

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return this.dato;
    }

    public void setSig(Nodo sigNodo){
        this.sig = sigNodo;
    }

    public Nodo getSig(){
        return this.sig;
    }

}
