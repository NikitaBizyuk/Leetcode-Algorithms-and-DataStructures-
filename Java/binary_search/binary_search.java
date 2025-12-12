import java.util.Arrays;

/**
 *
 */
public class binary_search {



    public static void main(String[] args){
        int [] nums = {4,3,6,3,23,543,321,32,45,654,7456,324,2354,7654,3,2,1,99,88};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(search(nums,0));
    }

    /**
     * LeetCode #704 -medium
     * @param nums numbers array
     * @param target target integer value
     * @return index position if target found, -1 if target not found
     */
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while( left <= right){
            middle = (right + left)/2;
            if(target > nums[middle]){
                left = middle + 1;
            }
            else if(target < nums[middle]){
                right = middle - 1;
            }
            else {
                return 1;
            }
        }
        return -1;
    }
}
