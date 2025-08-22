nums1 = [3,2,4]
target1 = 6

nums2 = [2,7,11,15]
target2 = 9

nums3 = [3,3]
target3 = 6

def twoSum(nums, target):
    # Create an empty hash table to store elements and their indices.
    num_map = {}
    # Iterate through the array from left to right.
    for i in range(len(nums)):
        # For each element nums[i], calculate the complement by subtracting it from the target
        complement = target - nums[i]
        # Check if the complement exists in the hash table. If it does, we have found a solution.
        if complement in num_map:
            return [num_map[complement],i]
        num_map[nums[i]] = i
    # If no solution is found, return an empty array or an appropriate indicator.
    return []


print(twoSum(nums1, target1), "are indices of the two numbers from", nums1, "such that they add up to target", target1)
print(twoSum(nums2, target2), "are indices of the two numbers from", nums2, "such that they add up to target", target2)
print(twoSum(nums3, target3), "are indices of the two numbers from", nums3, "such that they add up to target", target3)