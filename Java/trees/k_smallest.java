import java.util.*;

public class k_smallest {

    public int kthSmallest(TreeNode root, int k) {
        int n = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            n += 1;
            if( n == k){
                return cur.val;
            }
            cur = cur.right;
        }
        return -1;
        }
    }
}
