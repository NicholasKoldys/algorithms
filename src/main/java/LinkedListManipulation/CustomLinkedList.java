package LinkedListManipulation;

import util.SpecialCharFunctions;

public class CustomLinkedList {
    public Node head;

    public static class Node {
        public String data; // data container - in this case "int"
        public Node next; // pointer

        public Node(String d) {
            data = d;
        }
    }

    public static CustomLinkedList createLinkedList(int vertices) {

        CustomLinkedList cl = new CustomLinkedList();
        char ch = 'A';
        cl.head = new CustomLinkedList.Node("0" + ch);
        CustomLinkedList.Node holder = null;

        for(int i = 0; i < vertices; i++) {
            if(i == 0) {
                holder = cl.head;
                continue;
            }

            if(holder.next == null) {
                holder.next =
                        new CustomLinkedList.Node(String.valueOf(i) + SpecialCharFunctions.getiThAlphabetChar(i));
            } else {
                holder.data = String.valueOf(i) + SpecialCharFunctions.getiThAlphabetChar(i);
            }
            System.out.print( i + ":" + holder.data + " -> " );
            holder = holder.next;
        }

        return cl;
    }
}
