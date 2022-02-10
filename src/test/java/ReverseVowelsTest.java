import StringManipulation.ReverseString;
import StringManipulation.ReverseVowels;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsTest {

    @Test
    void reverseVowels() {

        ReverseVowels rv = new ReverseVowels();

        assertAll("Does the string have vowels, if so reverse them.",
                () -> assertEquals("uoiea", rv.reverseVowels("aeiou"))
        );
    }
}
