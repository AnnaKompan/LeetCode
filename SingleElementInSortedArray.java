public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int[] nums2 = { 3, 3, 7, 7, 10, 11, 11 };

        System.out.println("Single element is " + singleNonDuplicate(nums1));
        System.out.println("Single element is " + singleNonDuplicate(nums2));
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        String message = "not in the array";

        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
