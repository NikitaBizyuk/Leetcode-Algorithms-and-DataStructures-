import java.util.Arrays;

public class koko_eat_banana {


    public static void main(String[] args){
        int[] piles = {25,10,23,4};
        System.out.println(minEatingSpeed(piles,4));
        //System.out.println(Math.ceil((double)25/6));
    }

    /**
     * Leetcode #875
     * Koko Eating Bananas
     * @param piles list of banana piles
     * @param h hours to eat bananas
     * @return minimum eating speed
     */
    public static int minEatingSpeed(int[] piles, int h) {
        int bananasPerHour = maxValue(piles);
        int left = 1;
        int right = bananasPerHour;
        int middle = 0;
        int sumHours = 0;
        while( left <= right){
            middle = (left + right)/2;
            sumHours = 0;
            for(int j = 0; j < piles.length; j++){
                sumHours += Math.ceil((double)piles[j]/middle);
            }
            if(sumHours <= h){
                bananasPerHour = Math.min(bananasPerHour,middle);
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return bananasPerHour;
    }

    public static int maxValue(int[] piles){
        int max = 0;
        for(int i = 0; i < piles.length; i ++){
            max = Math.max(max,piles[i]);
        }
        return max;
    }




}
