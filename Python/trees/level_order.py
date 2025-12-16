import collections

from TreeNode import TreeNode
from typing import Optional
class Solution:

    def levelOrder(self,root: Optional[TreeNode]):
        q = collections.deque()
        q.append(root)
        result = []
        while q:
            level = []
            length = len(q)
            for i in range(length):
                node = q.popleft()
                if node:
                    level.append(node.val)
                    q.append(node.left)
                    q.append(node.right)
            if level:
                result.append(level)
        return result