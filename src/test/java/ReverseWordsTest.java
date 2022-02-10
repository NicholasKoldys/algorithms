import StringManipulation.ReverseWords;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @Test
    void shouldReverseWords() {

        ReverseWords rw = new ReverseWords();

        assertAll( "Testing multiple sentences for reversing..",
                () -> assertEquals("s'teL ekat edoCteeL tsetnoc", rw.reverseWords("Let's take LeetCode contest")),
                () -> assertEquals("doG gniD", rw.reverseWords("God Ding")),
                () -> assertEquals("I evol u", rw.reverseWords("I love u"))
        );
    }
}