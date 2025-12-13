public class rotated_sorted_array {

    public static void main(String[] args){
        int[] nums1 = {3,4,5,6,0,1,2};
        int[] nums2 = {3,4,5,1,2};
        int[] nums3 = {11,13,15,17};
        int[] nums4 = {5,1,2,3,4};
        System.out.println(findMin(nums1));
       System.out.println(findMin(nums2));
        System.out.println(findMin(nums3));
        System.out.println(findMin(nums4));

    }

    /**
     * LeetCode #153
     * Medium
     * Find minimum value in rotated sorted array
     * using binary search
     * @param nums integer array
     * @return minimum value in the array
     */
    public static int findMin(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        int min = Integer.MAX_VALUE;
        while(left <= right){
            middle = (left + right)/2;
            min = Math.min(min,nums[middle]);
            if(nums[right] < nums[middle]){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return min;
    }


}
