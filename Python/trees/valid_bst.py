from typing import Optional

from TreeNode import TreeNode
class Solution:
    def isValidBST(self,root: Optional[TreeNode]) ->bool:

        def isValid(node,left,right):
            if not node:
                return True
            if not(node.val < right and node.val > left):
                return False
            return isValid(node.left,left,node.val) and isValid(node.right,node.val, right)
        return isValid(root, float("-inf"), float("inf"))
