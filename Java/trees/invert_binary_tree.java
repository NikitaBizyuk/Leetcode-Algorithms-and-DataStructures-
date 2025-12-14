public class invert_binary_tree {

    public static void main(String[] args){
        System.out.println("Hello");


    }
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
