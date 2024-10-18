import java.util.Arrays;
import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scanValue = scan.nextInt();
        int[] arr = {4,2,3,5,8,7};

        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
        int plus = 0;
        if (scanValue < arr.length){
            for (int i = 0; i < scanValue; i++) {
                plus += arr[i];
            }
            System.out.println(plus);
        }
        else {
            System.out.println("Ay xiyar, Gormursen o qeder eded yoxduuur!");
        }

    }
}
