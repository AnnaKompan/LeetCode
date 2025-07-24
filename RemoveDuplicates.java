
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2 };
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println("Number of unique elements from array " + Arrays.toString(nums1) + " is: " + removeDup(nums1));
        System.out.println("Number of unique elements from array " + Arrays.toString(nums2) + " is: " + removeDup(nums2));
    }

    public static int removeDup(int[] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[j] != nums[i]){
                i ++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
