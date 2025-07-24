
import java.util.Arrays;
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums1 = { -1, 0, 3, 5, 9, 12 };
        int target1 = 9;
        int[] nums2 = { -1, 0, 3, 5, 9, 12 };
        int target2 = 2;

        System.out.println("Insert position of " + target1 + " is: " + searchInsert(nums1, target1));
        System.out.println("Insert position of " + target2 + " is: " + searchInsert(nums2, target2));
    }
    // public static int searchInsert(int[] nums, int target) {

    //     int left = 0;
    //     int right = nums.length - 1;

    //     while (left <= right){
    //         int mid = left + (right - left) / 2;
    //         if (nums[mid] == target){
    //             return mid;
    //         }
    //         else if (nums[mid] > target){
    //             right = mid - 1;
    //         }
    //         else{
    //             left = mid + 1;
    //         }
    //     }
    //     return left;
    // }
    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index > -1) {
            return index;
        }
        else {
            return Math.abs(index) - 1;
        }
    }
}