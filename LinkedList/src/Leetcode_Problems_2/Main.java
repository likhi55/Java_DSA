package Leetcode_Problems_2;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
//        linkedList.getTail().next = linkedList.getHead();

        boolean hasLoop = linkedList.hasLoop();

        System.out.println(hasLoop);
    }
}
