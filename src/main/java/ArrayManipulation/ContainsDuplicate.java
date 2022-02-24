package ArrayManipulation;

import java.util.HashSet;

public class ContainsDuplicate {

//    Given an integer array nums, return true if any value appears at least twice in the array,
//    and return false if every element is distinct.7
//
//    Example 1:
//    Input: nums = [1,2,3,1]
//    Output: true
//
//    Example 2:
//    Input: nums = [1,2,3,4]
//    Output: false
//
//    Example 3:
//    Input: nums = [1,1,1,3,3,4,3,2,4,2]
//    Output: true
//
//    Constraints:
//    1 <= nums.length <= 105
//    -109 <= nums[i] <= 109

    public boolean isContainDuplicates(int[] nums) {

        // We will be able to walk the array with a two pointer technique.
        // Ie. [1, 3, 4, 5, 8, 9, 2, 3, 5, 6 ,7]
        //      >                             <
        // Select the first value 1, and then with both pointers iterate until the num is reached.
        // return true or the array will shrink and move to the second value.
        // this is O(logn)

        // Or each value can be stored as a key as iterated and checked as iterated through
        // [key 1 , pos 0] - [key 3, pos 1] ...
        // this is O(n) but storage complexity can be O(n) worst case.

        HashSet<Integer> storedValues = new HashSet<>();
        int left = 0, right = nums.length - 1;

        // This double pointer approach causes a lot of trouble if the the array is odd and small.
         /*while(left < right) {
             if(nums[left] == nums[right] || storedValues.contains(nums[left]) || storedValues.contains(nums[right])) {
                 return true;
             }
             storedValues.add(nums[left]);
             storedValues.add(nums[right]);
             left++;
             right--;
         }*/

        // This method takes longer but doesnt run into issues.
        for(int i = 0; i < nums.length; i++) {
            if(storedValues.contains(nums[i])) {
                return true;
            }

            storedValues.add(nums[i]);
        }

        return false;
    }
}
