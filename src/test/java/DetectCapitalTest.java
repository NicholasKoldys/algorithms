import StringManipulation.DetectCapital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {

//    @Disabled
    @Test
    @DisplayName("DetectCapitalUse Method Tests: ")
    void shouldDetectCapitalUse() {

        DetectCapital dt = new DetectCapital();

        Assertions.assertAll( "Testing multiple strings..",
                () -> assertEquals(true, dt.detectCapitalUse("USA")),
                () -> assertEquals(true, dt.detectCapitalUse("clear")),
                () -> assertEquals(false, dt.detectCapitalUse("flaG")),
                () -> assertEquals(true, dt.detectCapitalUse("Leetcode"))
        );
    }

    @Disabled
    @Test
    @DisplayName("DetectCapitalUse Method Tests: ")
    void shouldDetectCapitalUseOther() {

        DetectCapital dt = new DetectCapital();

        Assertions.assertAll( "Testing multiple strings..",
                () -> assertEquals(true, dt.detectCapitalUse1stAttempt("USA")),
                () -> assertEquals(true, dt.detectCapitalUse1stAttempt("clear")),
                () -> assertEquals(false, dt.detectCapitalUse1stAttempt("flAG")),
                () -> assertEquals(true, dt.detectCapitalUse1stAttempt("Leetcode"))
        );
    }
}