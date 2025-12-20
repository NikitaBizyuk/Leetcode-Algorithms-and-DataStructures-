import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightSideView {


    public static List<Integer> rightSide(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null){q.offer(root);}
        while(!q.isEmpty()){
            TreeNode rightSide = null;
            int length = q.size();
            for(int i = 0; i < length; i ++){
                TreeNode node = q.poll();
                rightSide = node;
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }

            }
            result.add(rightSide.val);
        }
        return result;
    }

}
