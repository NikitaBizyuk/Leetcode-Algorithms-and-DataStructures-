from TreeNode import TreeNode
class Solution:

    def goodNodes(self, root: TreeNode) -> int:

        def dfs(node: TreeNode, max_num):
            if not node:
                return 0
            res = 1 if node.val >= max_num else 0
            max_num = max(node.val,max_num)
            res += dfs(node.left,max_num)
            res += dfs(node.right,max_num)
            return res

        return dfs(root,root.val)