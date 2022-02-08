import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Disabled
    @Test
    void reverseVowels() {

        assertAll("Is the string a palindrome? Reverse = same word",
                () -> assertEquals("uoiea", Main.reverseVowels("aeiou"))
        );
    }

    @Test
    void longestCommentPrefix() {

        assertAll("",
                () -> assertEquals("fl", Main.longestCommonPrefix( ( new String[]{"flower", "flow", "flight"} ) ) )
        );
    }
}