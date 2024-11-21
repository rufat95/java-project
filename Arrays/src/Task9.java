public class Task9 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, -1, -1};
        arraysCount(arr);
    }
    public static int arraysCount(int[] arr){

        int countPlus = 0;
        int countMinus = 0;
        int equalZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                countPlus++;
            }
            if(arr[i] < 0){
                countMinus++;
            }
            if (arr[i] == 0){
                equalZero++;
            }
        }
        double a = (double) countPlus / arr.length;
        double b = (double) countMinus / arr.length;
        double c = (double) equalZero / arr.length;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        return 1;
    }
}
