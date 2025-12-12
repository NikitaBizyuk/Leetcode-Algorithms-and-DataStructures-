import java.util.Arrays;

public class permutationInString {

    public static void main(String[] args){

        String s1 = "abc";
        String s2 = "lecabee";
        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] myString = new int[26];
        int left = 0;
        int right = 0;
        for(int i = 0; i <s1.length(); i++){
            myString[s1.charAt(i) - 'a'] ++;
        }
        int[] compare = new int[26];
        while(right < s2.length()){
            compare[s2.charAt(right) - 'a'] ++;
            right++;
            if( right - left == s1.length()){
                if(Arrays.equals(compare,myString)){
                    return true;
                }
                compare[s2.charAt(left) - 'a'] --;
                left++;
            }
        }
        return false;
    }

}
