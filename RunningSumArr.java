
import java.util.Arrays;

public class RunningSumArr {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,1,1};
        int[] nums2 = {3,1,2,10,1};
        int[] nums3 = {1,2,3,4};
        System.out.println("Running Sum of nums" + Arrays.toString(nums1) + "is: " + Arrays.toString(runningSum(nums1)));
        System.out.println("Running Sum of nums" + Arrays.toString(nums2) + "is: " + Arrays.toString(runningSum(nums2)));
        System.out.println("Running Sum of nums" + Arrays.toString(nums3)+ "is: " + Arrays.toString(runningSum(nums3)));

    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] += sum;
        }
        return runningSum;
    }
}