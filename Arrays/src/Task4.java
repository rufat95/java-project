import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {3,7,2,1,1,9};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int countingSort(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] arrDemo = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            arrDemo[arr[i]] += 1;
        }

        int counter = 0;
        for (int i = 0; i < arrDemo.length; i++) {
            while (arrDemo[i] != 0){
                arr[counter++] = i;
                arrDemo[i]--;
            }
        }
        return max;
    }
}
