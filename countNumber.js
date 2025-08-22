const nums1 = [1, 2, 2, 1];
const k1 = 1;
const nums2 = [1, 3];
const k2 = 3;
const nums3 = [3, 2, 1, 5, 4];
const k3 = 2;

function countKDifference(nums, k) {
  const index = {};
  let pairCounter = 0;
  for (let i = 0; i < nums.length; i++) {
    const x = nums[i]; // 1 // 2 // 2 // 1
    const y1 = x - k; // 1-1=0 // 2-1=1 // 2-1=1 // 1-1=0
    const y2 = x + k; // 1+1=2 // 2+1=3 // 2+1=3 // 1+1=2
    pairCounter += (index[y1] ?? 0) + (index[y2] ?? 0); // 0+0 // 1+0 // 1+0 // 0+2
    index[x] = (index[x] ?? 0) + 1; // index[1] = 1 // index[2] = 1 // index[2] = 2 // index[1] = 2
  }
  // index = {1:2, 2:2}
  //   pairCounter = 4
  return pairCounter;
}

console.log(
  `For numbers: ${nums1}, minimum num of pairs of indeces i, j (i<j), where |nums[i] - nums[j]| == ${k1} is ${countKDifference(
    nums1,
    k1
  )}`
);
console.log(
  `For numbers: ${nums2}, minimum num of pairs of indeces i, j (i<j), where |nums[i] - nums[j]| == ${k2} is ${countKDifference(
    nums2,
    k2
  )}`
);
console.log(
  `For numbers: ${nums3}, minimum num of pairs of indeces i, j (i<j), where |nums[i] - nums[j]| == ${k3} is ${countKDifference(
    nums3,
    k3
  )}`
);
