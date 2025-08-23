const nums1 = [1, 3, 5, 4, 7];
const nums2 = [2, 2, 2, 2, 2];
/* Option 1
function findLengthOfLCIS(nums) {
    // state of dynamic array
    const dp = [];

    dp[0] = 1; // least
    for (let i = 1; i< nums.length; i++){
        if(nums[i] > nums[i-1]){
            const previousSubsequenceLen = dp[i-1];
            const currSubsequenceLen = previousSubsequenceLen + 1;
            dp[i] = currSubsequenceLen;
        }else{
            dp[i] = 1; // back to basic to go to next subsequence
        }
    }
    return Math.max(...dp);
}; */

function findLengthOfLCIS(nums) {
  let currLen = 1;
  let maxLen = 1;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i + 1] > nums[i]) {
      currLen++;
      if (currLen > maxLen) {
        maxLen = currLen;
      }
    } else {
      currLen = 1;
    }
  }
  return maxLen;
}

console.log(
  `Longest continuous increasing subsequence in array 1 ${nums1} is ${findLengthOfLCIS(
    nums1
  )}`
);
console.log(
  `Longest continuous increasing subsequence in array 2 ${nums2} is ${findLengthOfLCIS(
    nums2
  )}`
);
