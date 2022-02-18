package LinkedListManipulation;

public class RemoveKthElement {

    // Create a Linked list that deletes the kth element from the list.

    // 5 -> 9 -> 10 -> 2 -> 15 -> null
    // k = 2
    // so delete the 2nd to last element 2 from the list.

    public CustomLinkedList removeLinkedListElement(CustomLinkedList linkedList, int k) {

        System.out.println(linkedList.toString());

        CustomLinkedList.Node nx = linkedList.head;
        int i = 0;

        if(k == 1) {
            linkedList.head = linkedList.head.next;
        } else {
            while(nx.next != null) {
                if(i + 1 == k - 1) {
                    nx.next = nx.next.next;
                    break;
                }
                nx = nx.next;
                i++;
            }
        }

        System.out.println(linkedList.toString());

        return linkedList;
    }

    public int removeLinkedListElement1stAttempt(CustomLinkedList linkedList, int k) {

        CustomLinkedList.Node node = linkedList.head;
        CustomLinkedList.Node kth = null;

        // Just Print out the values
        while(node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        for(int i = 0; i < k; i++) {
            if(i == 0) { kth = linkedList.head; continue; }
            System.out.println(kth.data);
            if(kth.next == null) break;
            kth = kth.next;
        }

        return 0;
    }
}
