import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums1 = { 2, 0, 2, 1, 1, 0 };
        int[] nums2 = { 2, 0, 1 };

        System.out.println("Sorted version of " + Arrays.toString(nums1) + " is " + Arrays.toString(SortCol(nums1)));
        System.out.println("Sorted version of " + Arrays.toString(nums2) + " is " + Arrays.toString(SortCol(nums1)));
    }

    // public static int[] SortCol(int[] nums){
    //     int n = nums.length;
    //     for(int i = 0; i < n; i++){
    //         boolean swapped = false;
    //         for (int j = 0; j < n - i - 1; j++){
    //             if (nums[j + 1] < nums[j]) {
    //                 int temp = nums[j];
    //                 nums[j] = nums[j+1];
    //                 nums[j+1] = temp;
    //                 swapped = true;
    //             }
    //         }
    //         if (!swapped){
    //             break;
    //         }
    //     }
    //     return nums;
    // }
    public static int[] SortCol(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low += 1;
                mid += 1;
            } else if (nums[mid] == 1) {
                mid += 1;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high -= 1;
            }
        }
        return nums;
    }
}