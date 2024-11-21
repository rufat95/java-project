public class Task10 {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };
        System.out.println(cross(nums));
    }

    public static int cross(int[][] nums){
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(i==j){
                  a+= nums[i][j];
                  b+= nums[i][nums.length-j-1];
                }
            }
        }
        return Math.abs(a-b);
    }
}
