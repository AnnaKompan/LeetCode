public class FindMinimum {
    public static void main(String[] args) {
        int[] nums1 = { 3, 4, 5, 1, 2 };
        int[] nums2 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] nums3 = { 11, 13, 15, 17 };

        System.out.println("Minimum number 1 is : " + findMin(nums1));
        System.out.println("Minimum number 2 is : " + findMin(nums2));
        System.out.println("Minimum number 3 is : " + findMin(nums3));

    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
