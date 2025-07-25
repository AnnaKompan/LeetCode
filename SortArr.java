
import java.util.Arrays;

public class SortArr {
    // int[] nums1 = [5,2,3,1];
    // int[] nums2 = [5,1,1,2,0,0];

    public static void main(String[] args) {
        int[] nums1 = { 4, 2, 3, 1 };
        int[] nums2 = { 2, 2, 3, 1 };
        System.out.println("Sorted array of " + Arrays.toString(nums1) + " is " + Arrays.toString(sortArray(nums1)));
        System.out.println("Sorted array of " + Arrays.toString(nums2) + " is " + Arrays.toString(sortArray(nums2)));

    }

    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j + 1];
                    nums[j+1] = nums[j];
                }

            }
        }
        return nums;
    }
}
