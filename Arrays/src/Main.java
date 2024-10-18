import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

//        for (int i = n-1; i >=0 ; i--) {
//            System.out.print(arr[i] + ", ");
//        }

//        for (int i = 0; i < n ; i++) {
//            if(arr[i] > 0){
//                System.out.print(arr[i] + ", ");
//            }
//        }
        int counter = 0;
        for (int i = 0; i < n ; i++) {

            if(arr[i] < 0){
                counter++;

            }
        }
        if (counter==0){
            System.out.println("NO");
        }
        else {
            System.out.println(counter);
            for (int i = n-1; i >=0 ; i--) {
                if(arr[i]< 0){
                    System.out.print(arr[i] + ", ");
                }
            }
        }
    }

}