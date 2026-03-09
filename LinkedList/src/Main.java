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

        linkedList.reverse();
        linkedList.printList();
    }
}
