# Time: O(log(h)) # h-height of tree
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution(object):
    def binary_tree_tilt(self, root):
        self.tilt = 0
        def sum_tilt(node):
            if node is None:
                return 0
            left = sum_tilt(node.left)
            right = sum_tilt(node.right)
            self.tilt += abs(left - right)
            return left + right + node.val
        sum_tilt(root)
        return self.tilt

root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
sol = Solution()
print(sol.binary_tree_tilt(root))