public class Test {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);

        list.addItem(new Node("Mango"));
        list.addItem(new Node("Apple"));
        list.addItem(new Node("Banana"));
        list.addItem(new Node("Orange"));

        System.out.println("Linked List:");
        list.traverse(list.getRoot());

        System.out.println("\nAfter removing Banana:");
        list.removeItem(new Node("Banana"));
        list.traverse(list.getRoot());

        System.out.println("\nAdding duplicate Apple:");
        System.out.println(list.addItem(new Node("Apple")));
    }
}