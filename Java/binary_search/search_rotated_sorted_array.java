public class search_rotated_sorted_array {

    public static void main(String []args){
        int[] nums = {3,4,5,6,1,2};
        int[] nums2 = {3,5,6,0,1,2};
        System.out.println(search(nums,1));
        System.out.println(search(nums,4));
    }

    /**
     * Leetcode #33
     * Search in sorted array
     * @param nums array storing integer values
     * @param target value
     * @return index position of target value or -1
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while( left <= right){
            middle = (left + right)/2;
            if(nums[middle] == target){
                return middle;
            }
            if(nums[left] < nums[middle]){
                if(target < nums[middle] && target >= nums[left]){
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if(target > nums[middle] && target < nums[right]){
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            }
        return -1;
    }
}
