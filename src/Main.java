
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.addAtFirst(4);
        list.addAtFirst(3);
        list.addAtFirst(2);
        list.addAtFirst(1);

        list.printList();
        System.out.println("la lista tiene "+ list.count());
        System.out.println();
        list.delete(3);

        list.printList();
        System.out.println("la lista tiene "+ list.count());

        list.addAtLast(45);
        list.addAtFirst(99);

        list.printList();

        System.out.println("la lista tiene "+ list.getSize());



    }
}