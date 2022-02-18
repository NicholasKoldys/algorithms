import LinkedListManipulation.CustomLinkedList;
import LinkedListManipulation.RemoveKthElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveKthElementTest {

    @Test
    void removeKthElement() {

        RemoveKthElement re = new RemoveKthElement();

        String sol1 = "0:0A -> 1:1B -> 2:2C -> 3:4E -> 4:5F -> 5:6G -> ";
        String sol2 = "0:1B -> 1:2C -> 2:3D -> 3:4E -> 4:5F -> 5:6G -> ";

        Assertions.assertAll(
                "",
                () -> Assertions.assertEquals(sol1, re.removeLinkedListElement(CustomLinkedList.createLinkedList(8), 4).toString()),
                () -> Assertions.assertEquals(sol2, re.removeLinkedListElement(CustomLinkedList.createLinkedList(8), 1).toString())
        );
    }
}
