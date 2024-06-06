public class MyList<T> {
    private Node<T> head;
    private int size = 0;
    public MyList (){
        this.head = null;
    }
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.head == null;
    }
    public void printList() {
        Node<T> current = this.head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int count() {
        int count = 0;
        if(isEmpty()) return count;

        Node<T> current = this.head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
    public void addAtFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            this.head = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
        size ++;

    }

    public boolean existElement(T x) {
        if(isEmpty()) return false;

        Node actual = this.head;
        while (actual != null) {
            if (actual.getData() == x) {
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }

    public void delete(T x) {
        if(isEmpty()) return;

        if (this.head.getData()== x) {
            this.head = this.head.getNext();
        }else{
            Node<T> prev = this.head;
            Node<T> current = this.head.getNext();
            while (current.getData()!=x) {
                prev = current;
                current = current.getNext();
            }
            prev.setNext(current.getNext());
            current.setNext(null);
        }

        size --;



    }

    public void addAtLast(T data) {
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            this.head = newNode;
        }else{
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        size ++;

    }

    MyList<T> invertir() {
        MyList<T> nuevaLista = new MyList<T>;
        while (this.primero != null) {
            Node<T> aux = primero;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            aux = null;
        }
        return nuevaLista;
    }

}
