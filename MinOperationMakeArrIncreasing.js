const nums1 = [1, 1, 1];
const nums2 = [1, 5, 2, 4, 1];
const nums3 = [8];

function minOperations(nums) {
  let counter = 0;
  for (let i = 1; i <= nums.length; i++) {
    if (nums[i] <= nums[i - 1]) {
      let diff = nums[i - 1] - nums[i] + 1;
      nums[i] += diff;
      counter += diff;
    }
  }
  return counter;
}

console.log(
  `Minimum operations needed to make ${nums1} increasing ${minOperations(
    nums1
  )}`
);
console.log(
  `Minimum operations needed to make ${nums2} increasing ${minOperations(
    nums2
  )}`
);
console.log(
  `Minimum operations needed to make ${nums3} increasing ${minOperations(
    nums3
  )}`
);
