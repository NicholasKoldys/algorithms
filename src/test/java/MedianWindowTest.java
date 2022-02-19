import ArrayManipulation.MedianWindows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianWindowTest {

    @Test
    public void medianWindow() {
        MedianWindows mw = new MedianWindows();
        String s1 = "3,1,3,4,5,10,6,4";
        String res1 = "1,2,3,4,5,6,6";

        Assertions.assertAll("",
                () -> Assertions.assertEquals(res1, mw.medianWindow(s1) )
        );
    }
}
