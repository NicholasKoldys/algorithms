package StringManipulation;

public class ReverseString {

//    Write a function that reverses a string. The input string is given as an array of characters s.
//    You must do this by modifying the input array in-place with O(1) extra memory.
//
//    Example 1:
//    Input: s = ["h","e","l","l","o"]
//    Output: ["o","l","l","e","h"]
//
//    Example 2:
//    Input: s = ["H","a","n","n","a","h"]
//    Output: ["h","a","n","n","a","H"]
//
//    Constraints:
//    1 <= s.length <= 105
//    s[i] is a printable ascii character.

    public void reverseString(char[] s) {
        //2 Pointer Method
        int charSLength = s.length;

        //charSLength - 1 because the length doesnt indicate indexes.
        int left = 0, right = charSLength - 1;

        // declare temp outside to assist in memory preservation and time.
        char temp;

        while( left < right ) {

            //single character sway.
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            //always moving towards the midpoint
            left++;
            right--;
        }
    }

    public void reverseString1stAttempt(char[] s) {
        // int sLength = (int) Math.ceil(s.length/2f);
        boolean isEven = s.length % 2 == 0;
        if( isEven ) {
            for(int i = 0; i < s.length/2; i++) {
                char temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }
        } else {
            int oddMiddlePoint = (int) Math.ceil(s.length/2f);
            for(int i = 0; i < oddMiddlePoint; i++) {
                if(i == oddMiddlePoint - 1) {
                    break;
                }
                char temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }
        }
        System.out.print(s);
    }
}
