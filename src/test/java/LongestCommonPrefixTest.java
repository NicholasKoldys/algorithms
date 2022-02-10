import StringManipulation.LongestCommonPrefix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class LongestCommonPrefixTest {

    @Test
    void longestCommentPrefix() {

        LongestCommonPrefix lcp = new LongestCommonPrefix();

        assertAll("",
                () -> Assertions.assertEquals("fl", lcp.longestCommonPrefix( ( new String[]{"flower", "flow", "flight"} ) ) )
        );
    }
}
