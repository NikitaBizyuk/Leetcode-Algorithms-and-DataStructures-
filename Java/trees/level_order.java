import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class level_order {

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int length = q.size();
            TreeNode node = q.poll();
            for(int i = 0; i < length; i++){
                if(node != null){
                    level.add(node.val);
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if(!level.isEmpty()){
                result.add(level);
            }
        }
        return result;
    }


}
