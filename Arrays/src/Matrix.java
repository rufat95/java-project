public class Matrix {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {3,2,1},
            {4,4,4},
            {8,8,8}
        };

        int[] bestRich = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int rich = 0;
            for (int j = 0; j < a[i].length; j++) {
                rich += a[i][j];
            }
            bestRich[i] = rich;
        }
        int maxValue = bestRich[0];
        for (int i = 1; i < bestRich.length; i++) {
            System.out.println(bestRich[i] + ", ");
            if(maxValue<bestRich[i]){
                maxValue = bestRich[i];
            }
        }
        System.out.println();
        System.out.println(maxValue);
    }
}
