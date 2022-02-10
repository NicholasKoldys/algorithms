package StringManipulation;

public class ReverseVowels {

//    Given a string s, reverse only all the vowels in the string and return it.
//    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
//
//    Example 1:
//    Input: s = "hello"
//    Output: "holle"
//
//    Example 2:
//    Input: s = "leetcode"
//    Output: "leotcede"
//
//    Constraints:
//    1 <= s.length <= 3 * 105
//    s consist of printable ASCII characters.

    public String reverseVowels(String s) {

        int sLength = s.length();

        if(sLength <= 1) {
            return s;
        }

        // char concat is cheap
        char[] cArr = s.toCharArray();
        int left = 0, right = sLength - 1;
        char temp = ' ';

        while(left < right) {

            if(!isCharVowel(cArr[left])) { left++; continue;}
            if(!isCharVowel(cArr[right])) { right--; continue;}

            if(isCharVowel(cArr[left]) && isCharVowel(cArr[right])) {
                temp = cArr[left];
                cArr[left] = cArr[right];
                cArr[right] = temp;
            }

            left++;
            right--;
        }

        return new String(cArr);
    }

    public boolean isCharVowel(char c) {
        char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
        for(char v : vowels) {
            if(c == v) {
                return true;
            }
        }
        return false;
    }

    public static String reverseVowels1stAttempt(String s) {

        // try to step down each side if possible
        int left = 0;
        int right = s.length() - 1;
        char[] cArr = s.toCharArray();
        char temp = ' ';

        // A E I O U
        // convert all to lower case

        // consist of all printable ascii characters.

        //loop through step across each and test for vowel.
        while(left < right) {

            // if meet vowel on left, hold till meet vowel on right
            if( ! testIfVowel( cArr[left] ) ) {
                left++;
            }

            if( ! testIfVowel( cArr[right] ) ) {
                right--;
            }

            if(testIfVowel( cArr[left] ) && testIfVowel( cArr[right] )) {
                temp = cArr[left];
                cArr[left] = cArr[right];
                cArr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(cArr);
    }

    public static boolean testIfVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
