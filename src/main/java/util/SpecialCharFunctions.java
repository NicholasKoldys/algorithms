package util;

public class SpecialCharFunctions {

    public static void printAllCharToInt() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] charArr = chars.toCharArray();
        int arrLength = charArr.length;

        for(int i = 0; i < arrLength; i++) {
            System.out.println(charArr[i] + " " + (int) charArr[i]);
        }
    }

    public static String getiThAlphabetChar(int i) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(i, i+1);
    }
}
