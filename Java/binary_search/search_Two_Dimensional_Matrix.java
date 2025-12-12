public class search_Two_Dimensional_Matrix {


    public static void main(String[] args){
        int[][]matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 8;
    }

    /**
     * Leetcode # 74 - medium
     * Search a 2D Matrix
     * @param matrix 2D num array
     * @param target int value
     * @return true or false
     */
    public static boolean searchMatrix(int[][] matrix, int target){
        int top = 0;
        int  bottom = matrix.length - 1;
        int col_right = matrix[0].length - 1;
        int col_left = 0;
        int col_mid;
        int middleRow = 0;
        while(top <= bottom){
            middleRow = (top  + bottom)/2;
            if(target >= matrix[middleRow][0] && target <= matrix[middleRow][col_right]){
                break;
            }
            else if(matrix[middleRow][0] < target){
                top = middleRow + 1;
            } else {
                bottom = middleRow - 1;
            }
        }
        if(top > bottom){
            return false; // No row found
        }
        while(col_left <= col_right){
            col_mid = (col_right + col_left)/2;
            if(target < matrix[middleRow][col_mid]){
                col_right = col_mid - 1;
            } else  if(target > matrix[middleRow][col_mid]){
                col_left = col_mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
