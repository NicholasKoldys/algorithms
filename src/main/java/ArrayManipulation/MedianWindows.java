package ArrayManipulation;

import java.util.*;

public class MedianWindows {

    /*
    * Given a string:
    *   3,1,3,4,5,10,6,4
            = 1,2,3,4,5,6,6
    *
    *   The first ele in the string is the window size.
    *   Take the median of each window across the entire array and return a string of the medians.
    *   The window will begin with 1 and reach size after n elements.
    * */

    public String medianWindow(String arr) {

        ArrayList<Integer> intArr = new ArrayList<>(arr.length() - 1);
        int windowSize = arr.charAt(0);
        // Wont work as have to retrieve the middle elements
        // PriorityQueue<Integer> window = new PriorityQueue<>(windowSize);
        ArrayList<Integer> window = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int leftBound = 0;
        float median = 0;

        for(int i = 1; i < arr.length(); i++) {
            if(arr.charAt(i) == ',') continue;
            intArr.add( (int) arr.charAt(i) );
        }

        for(int i = 0; i < intArr.size(); i++) {

            window.add(intArr.get(i));
            Collections.sort(window);
            double half = window.size() / 2D;
            if(window.size() % 2 == 0) {
                median = ( window.get((int) half) + window.get((int) half + 1) ) / 2f;
            } else {
                median = window.get((int) Math.floor(half));
            }

            if(i < intArr.size() - 1) {
                result.append(median).append(",");
            } else {
                result.append(median);
            }

            if(i - leftBound == windowSize) {
                window.remove(leftBound);
                leftBound++;
            }
        }

        return result.toString();
    }
}
