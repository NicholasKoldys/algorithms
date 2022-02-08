package StringManipulation;

public class ReverseWords {

//    Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//    Example 1:
//    Input: s = "Let's take LeetCode contest"
//    Output: "s'teL ekat edoCteeL tsetnoc"
//
//    Example 2:
//    Input: s = "God Ding"
//    Output: "doG gniD"
//
//    Constraints:
//
//    1 <= s.length <= 5 * 104
//    s contains printable ASCII characters.
//    s does not contain any leading or trailing spaces.
//    There is at least one word in s.
//    All the words in s are separated by a single space.

    public String reverseWords(String s) {

        String[] split = s.split(" ");
        String newString = "";

        for(int i = 0; i < split.length; i++) {
            char[] c = split[i].toCharArray();
            int wordLength = split[i].length();
            int left = 0, right = wordLength - 1;
            char temp;

            while(left < right) {
                temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }

            if(i == split.length - 1) {
                newString += new String(c);
            } else {
                newString += new String(c) + " ";
            }
        }

        return newString;
    }

    /** Something is breaking with this im not sure what maybe try to dumb down the solution
     * fails on last test  "I love u" > "I evu lo"
     */
    public static String reverseWords1stAttempt(String s) {

        char space = ' ';
        char[] sArr = s.toCharArray();
        int sLength = s.length();
        boolean start = false;
        int startChar = 0, endChar = 0;
        char temp = ' ';

        if(sLength <= 1) {
            return s;
        }

        for(int i = 0; i < sLength; i++) {

            if(sArr[i] == space || i == sLength - 1) {
                start = false;

                if(i == sLength - 1) {
                    endChar = i;
                } else {
                    endChar = i - 1;
                }

                if(startChar == endChar) {
                    continue;
                }

                while ( startChar < endChar ) {
                    temp = sArr[startChar];
                    sArr[startChar] = sArr[endChar];
                    sArr[endChar] = temp;
                    startChar++;
                    endChar--;
                }
            }

            if(sArr[i] != space && start != true) {
                start = true;
                startChar = i;
            }
        }

        return String.valueOf(sArr);
    }
}
