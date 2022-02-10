import StringManipulation.ValidPalindrome;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {

    @Test
    void isPalindrome() {

        ValidPalindrome vp = new ValidPalindrome();

        assertAll("Is the string a palindrome? Reverse = same word",
                () -> assertEquals(true, vp.isPalindrome("racecar"), "racecar failed"),
                () -> assertEquals(false, vp.isPalindrome("race a car"), "'race a car' should be false"),
                () -> assertEquals(true, vp.isPalindrome("A man, a plan, a canal: Panama"), "amanaplanacanalpanama " +
                        "failed"),
                () -> assertEquals(false, vp.isPalindrome("0P"), "0P should be false"),
                () -> assertEquals(true, vp.isPalindrome("110010011"), "110010011 failed")
        );
    }
}
