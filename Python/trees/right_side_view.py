from TreeNode import TreeNode
import collections
class solution:


    def rightSideView(self,root: TreeNode):
        res = []
        q = collections.deque()
        if root:
            q.append(root)
        while q:
            length = len(q)
            rightSide = None
            for i in range(length):
                node = q.popleft()
                rightSide = node
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            res.append(rightSide.val)
        return res


