import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println(searchMatrix(matrix, 5));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean value = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if (matrix[i][j] == target){
                    value = true;
                }
            }
        }
        return value;
    }
}
