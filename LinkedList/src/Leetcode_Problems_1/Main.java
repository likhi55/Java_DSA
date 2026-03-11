package Leetcode_Problems_1;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        LinkedList.Node node = linkedList.findMiddleNode();

        System.out.println(node.value);
    }
}
