package StringManipulation;

public class LongestCommonPrefix {

//        Write a function to find the longest common prefix string amongst an array of strings.
//            If there is no common prefix, return an empty string "".
//
//        Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
//
//
//        Constraints:
//
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//        strs[i] consists of only lower-case English letters.

    public String longestCommonPrefix(String[] strs) {

        int sLength = strs[0].length();
        char[] prefix = new char[ sLength - 1 ];
        char[] finalPrefix = {};
        int cPos = 0;
        char test = ' ';
        boolean flag = true;

        for(int i = 0; i < sLength; i++) {
            test = strs[0].charAt(i);

            for(String s : strs) {
                if(test != s.charAt(cPos)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                prefix[i] = test;
            } else {
                for(int x = 0; x < prefix.length; x++) {
                    if(prefix[x] == '\000') {
                        finalPrefix = new char[x-1];
                        break;
                    }
                }
                if(finalPrefix.length > 0) {
                    for(int y = 0; y < finalPrefix.length; y++) {
                        finalPrefix[y] = prefix[y];
                    }
                    return new String(finalPrefix);
                }
            }
        }
        return new String(finalPrefix);
    }

    public static String longestCommonPrefix1stAttempt(String[] strs) {

        StringBuilder prefix = new StringBuilder();

        for(int i = 0; i < strs.length; i++) {
            prefix.append(strs[0].charAt(i));

            for(String s : strs) {
                if(!isStringContains(s, prefix.toString())) {
                    if(prefix.length() > 0) {
                        char[] temp = prefix.toString().toCharArray();
                        prefix = new StringBuilder();
                        for(int j = 0; j < (temp.length - 1); j++) {
                            prefix.append(temp[j]);
                        }
                        return prefix.toString();
                    }
                }
            }
        }

        return prefix.toString();
    }

    public static boolean isStringContains(String check, String against) {

        for(int i = 0; i < against.length(); i++) {
            if( check.charAt(i) != against.charAt(i) ){
                return false;
            }
        }
        return true;
    }
}
