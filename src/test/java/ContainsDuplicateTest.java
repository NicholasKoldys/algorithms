import ArrayManipulation.ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {

        ContainsDuplicate cd = new ContainsDuplicate();

        Assertions.assertAll("",
                () -> Assertions.assertEquals(false, cd.isContainDuplicates(new int[] {1, 2, 3, 4})),
                () -> Assertions.assertEquals(true, cd.isContainDuplicates(new int[] {1, 2, 3, 5, 6, 7, 8, 9, 5})),
                () -> Assertions.assertEquals(true, cd.isContainDuplicates(new int[] {1, 0, 1})),
                () -> Assertions.assertEquals(true, cd.isContainDuplicates(new int[] {1000000000,1000000000,11}))
        );
    }
}
