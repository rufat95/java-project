public class Matrix2 {
    public static void main(String[] args) {
       int[][] grid = {
               {0,1,0,0},
               {1,1,1,0},
               {0,1,0,0},
               {1,1,0,0}
       };
       int count = 0;
        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + ", ");
                if(grid[i][j] == 1 && grid[i][j]-1 == 0 && grid[i][j]+1 == 0 && grid[i-1][j] == 0 && grid[i+1][j] == 0){

                }
            }
        }
    }
}
