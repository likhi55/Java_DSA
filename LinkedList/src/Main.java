public class Main {
    public static void print_node(LinkedList.Node node) {
        if (node != null) {
            System.out.println("Node: " + node.value);
        } else {
            System.out.println("Node: " + null);
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.printList();

        linkedList.set(0, 0);
        linkedList.set(1, 1);
        linkedList.set(2, 2);
        System.out.println("After set: ");
        linkedList.printList();

        boolean temp = linkedList.set(3, 0);
        System.out.println("set or not: " + temp);

        temp = linkedList.set(-1, 0);
        System.out.println("set or not: " + temp);
    }
}
