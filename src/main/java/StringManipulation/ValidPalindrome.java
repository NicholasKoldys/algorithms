package StringManipulation;

public class ValidPalindrome {

//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
//    non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//    Given a string s, return true if it is a palindrome, or false otherwise.
//
//    Example 1:
//    Input: s = "A man, a plan, a canal: Panama"
//    Output: true
//    Explanation: "amanaplanacanalpanama" is a palindrome.
//
//    Example 2:
//    Input: s = "race a car"
//    Output: false
//    Explanation: "raceacar" is not a palindrome.
//
//    Example 3:
//    Input: s = " "
//    Output: true
//    Explanation: s is an empty string "" after removing non-alphanumeric characters.
//    Since an empty string reads the same forward and backward, it is a palindrome.
//
//    Constraints:
//    1 <= s.length <= 2 * 105
//    s consists only of printable ASCII characters.


    public boolean isPalindrome(String s) {

        char[] cArr = s.toCharArray();
        int cArrLength = cArr.length;
        int left = 0, right = cArrLength - 1;

        while( left < right ) {

            if(Character.isLetterOrDigit(cArr[left]) && Character.isLetterOrDigit(cArr[right])) {

                System.out.println(cArr[left] + " " + cArr[right]);

                if(Character.toLowerCase(cArr[left]) != Character.toLowerCase(cArr[right])) {
                    return false;
                }

                left++; right--;

            } else {
                if(!Character.isLetterOrDigit(cArr[left])) {
                    left++;
                }

                if(!Character.isLetterOrDigit(cArr[right])) {
                    right--;
                }
            }
        }

        return true;
    }

    /**
     * My process of thinking, which takes too long,
     * I had spaces and non characters that needed to be removed, so I decided to do char array manipulation instead
     * of producing a simple result true and false - which doesnt require the end output array.  I need to focus on
     * outcome first and what the quickest path to that outcome there is - their is skipping and going around or
     * removing.
     *
     * @param s any string
     * @return boolean
     */
    public static boolean isPalindrome1stAttempt(String s) {

        char[] cArr = s.toCharArray();

        cArr = testForUsableCharacters(s.toCharArray());

        // Loop to step down each end (first and last of array) prevents ceiling division
        // to find mid-point and if the length is even or odd
        int i = 0, j = cArr.length - 1;
        while( i < j ) {
            if(cArr[i] != cArr[j]) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static char[] testForUsableCharacters(char[] cArr) {

        for( int i = 0; i < cArr.length; i++) {
            char c = cArr[i];

            if(c <= 57 && c >= 48) {
                continue;
            }

            if( (c <= 90 && c >= 65) ) {
                cArr[i] = (char) (c + 32);
            } else if(c > 122 || c < 97) {
                return testForUsableCharacters( removeCharNode(cArr, i) );
            }
        }
        return cArr;
    }

    public static char[] removeCharNode(char[] cArr, int removeCharPos) {

        String s = "";
        for( char c : cArr ) {
            if(c != cArr[removeCharPos]) {
                s += c;
            }
        }
        return s.toCharArray();
    }
}
