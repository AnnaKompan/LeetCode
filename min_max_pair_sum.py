nums1 = [3,5,2,3]
nums2 = [3,5,4,2,4,6]

def min_pair_sum(nums):
    nums.sort()
    max_sum = 0
    i = 0
    j = len(nums) - 1
    while(i < j):
        max_sum = max(max_sum, (nums[i] + nums[j]))
        i+=1
        j-=1
    return max_sum

print('Maximum pair sum is ', min_pair_sum(nums1))
print('Maximum pair sum is ', min_pair_sum(nums2))