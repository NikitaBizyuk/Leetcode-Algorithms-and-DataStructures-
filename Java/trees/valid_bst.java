public class valid_bst {

    public boolean isValidBST(TreeNode root){
        return isValid(root,Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    public static boolean isValid(TreeNode node, Double left, Double right){
        if(node == null){
            return true;
        }
        if(!(node.val > left && node.val < right)){
            return false;
        }
        return isValid(node.left,left, (double)node.val) &&
                isValid(node.right, (double)node.val, right);
    }
}
