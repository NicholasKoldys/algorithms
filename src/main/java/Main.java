import java.util.HashSet;

public class Main {

    public static void printAllCharToInt() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] charArr = chars.toCharArray();
        int arrLength = charArr.length;

        for(int i = 0; i < arrLength; i++) {
            System.out.println(charArr[i] + " " + (int) charArr[i]);
        }
    }

    public static boolean detectCapitalUse(String word) {

        char[] charArr = word.toCharArray();

        // char case CAP 65 - 90
        // char case low 95 - 122

        // if flag is 1 all caps, if 0 all undercase, if -1 first Uppercase;
        int flag = 0;

        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] >= 65 && charArr[i] <= 90 && ( i == 0 || flag == 1 )) {
                flag = 1;
            } else if(charArr[i] >= 97 && charArr[i] <= 122) {
                if(flag == 1 && i - 1 == 0) {
                    flag = -1;
                } else if(i == 0 || flag == 0) {
                    flag = 0;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        // does string start with a capital
        // does the string end with lower case

        //

        return true;
    }

    /** Something is breaking with this im not sure what maybe try to dumb down the solution
     * fails on last test  "I love u" > "I evu lo"
     */
    public static String reverseWords(String s) {

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

    public static String reverseVowels(String s) {

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

    public static String longestCommonPrefix(String[] strs) {

        // 1 <= strs.length <= 200
        // 0 <= strs[i].length <= 200
        // strs[i] consists of only lower-case English letters.

        // Write a function to find the longest common prefix string amongst an array of strings.

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

    //    public static int[] twoSum(int[] nums, int target) {
    //
    //    }

    public HashSet<int[]> sumSet = new HashSet();

    public static void main(String[] args) {
        printAllCharToInt();
    }
}



//
//        List list = new ArrayList();
//        list.add("hello");
//        list.add(2);
//
//        System.out.print(list.get(0).getClass());
//        System.out.print(list.get(1) instanceof Object);
//
//        int a = 1234512345;
//        System.out.println(a);
//
//        System.out.print("apple".compareTo("banana"));
//
//        for (int i=0; i<10; ){
//            i+=1;
//            System.out.println("Hello World!");
//        }
//
//        int array[] = {1, 2, 3, 4};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print('\n' + array[i]);
//        }
//
//        String message = "Hello world!";
//        String newMessage = message.substring(6, 12);
//        System.out.println('\n' + newMessage);
//
//        ArrayList<String> unSorted = new ArrayList<>( Arrays.asList( "ABCC", "Hello", "World", "DE", "A", "B", "C") );
//        unSorted.sort( Comparator.comparing( String::toString ) ); // the
//        System.out.println(unSorted);
//        Collections.sort(unSorted, Comparator.comparing( String::length ));
//        System.out.println(unSorted);
//
//        String message2 = "Hello";
//        // System.out.print( message2.charAt( 10 ) ); ! FAILS as unchecked out of bounds
//        for (int i = 0; i< message2.length(); i++) {
//            System.out.print( message2.charAt( i ) );
//        }
//
//        try {
//            System.out.println("A");
//            badMethod();
//            System.out.println("B");
//        } catch (Exception ex) {
//            System.out.println("C");
//        } finally {
//            System.out.println("D");
//        }
//
//        countMethod(null);
//    }
//    public static void badMethod() {
//        // throw new Error(); ! FAILS as throws -1 return event to exit main run of application,
//        // it does not result in an exception
//    }
//
//    static int count = 0;
//    public static void countMethod(String[] args) {
//        if (count < 3) {
//            count++;
//            countMethod(null); // each function call starts a new iteration call of the function,
//            // but as soon as the iteration else's and returns it will complete the waterfall-ed methods that it initiated.
//        } else {
//            return;
//        }
//        System.out.println("Hello World!");
//    }