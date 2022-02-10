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