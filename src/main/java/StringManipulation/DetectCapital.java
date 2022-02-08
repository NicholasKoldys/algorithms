package StringManipulation;

public class DetectCapital {

//    We define the usage of capitals in a word to be right when one of the following cases holds:
//
//    All letters in this word are capitals, like "USA".
//    All letters in this word are not capitals, like "leetcode".
//    Only the first letter in this word is capital, like "Google".
//
//    Given a string word, return true if the usage of capitals in it is right.
//
//    Example 1:
//    Input: word = "USA"
//    Output: true
//
//    Example 2:
//    Input: word = "FlaG"
//    Output: false
//
//    Constraints:
//    1 <= word.length <= 100
//    word consists of lowercase and uppercase English letters.


    public boolean detectCapitalUse(String word) {

        //2-pointer stepping
        int wordLength = word.length();
        int left = 0, right = wordLength - 1;
        int flag = -1;

        if( Character.isUpperCase(word.charAt(left)) && Character.isLowerCase(word.charAt(right)) ) {
            flag = 0;
        } else if( Character.isUpperCase(word.charAt(left)) && Character.isUpperCase(word.charAt(right)) ) {
            flag = 1;
        }

        while( left <= right ) {

            if(flag == 0 && left != 0
                    && ( Character.isUpperCase(word.charAt(left)) || Character.isUpperCase(word.charAt(right)) ) ) {
                return false;
            } else if(flag == 1 && ( Character.isLowerCase(word.charAt(left)) || Character.isLowerCase(word.charAt(right)) ) ) {
                return false;
            } else if(flag == -1 && ( Character.isUpperCase(word.charAt(left)) || Character.isUpperCase(word.charAt(right)) ) ) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean detectCapitalUse1stAttempt(String word) {
        char[] charArr = word.toCharArray();

        // char case CAP 65 - 90
        // char case low 95 - 122

        // if flag is 1 all caps, if 0 all undercase, if -1 incorrect;
        int flag = 0;

        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] >= 65 && charArr[i] <= 90 && ( i == 0 || flag == 1)) {
                flag = 1;
            } else if(charArr[i] >= 97 && charArr[i] <= 122) {
                if(flag == 1 && i - 1 == 0) {
                    flag = -1;
                } else {
                    flag = 0;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}