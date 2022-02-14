import ArrayManipulation.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void twoSum() {

        TwoSum ts = new TwoSum();

        int[] sum1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] sum2 = { 3, 2, 4 };

        int[] sol1 = ts.twoSum(sum1, 17);
        int end1 = sol1[0] + sol1[1];
        int[] sol2 = ts.twoSum(sum2, 6);
        int end2 = sol2[0] + sol2[1];


        Assertions.assertAll("Should return selected sum.",
                () -> Assertions.assertEquals( 17, end1 ),
                () -> Assertions.assertEquals( 6, end2 )
        );
    }
}
