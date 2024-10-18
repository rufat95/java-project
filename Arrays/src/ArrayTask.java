import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arrays = new int[30];

        for (int i = 0; i < arrays.length-1; i++) {
            Random rand = new Random();
            int f = rand.nextInt(-100, 100);
            arrays[i] = f;
        }

        for (int i = 0; i < arrays.length-1; i++) {
            if(arrays[i]<0 && arrays[i] % 2 == 0){
                System.out.print(arrays[i] + ", ");
            }
        }

        for (int i = 0; i < arrays.length-1; i++) {
            if(arrays[i]<0 && arrays[i] % 2 != 0){
                System.out.print(arrays[i] + ", ");
            }
        }

        for (int i = 0; i < arrays.length-1; i++) {
            if(arrays[i]>0 && arrays[i] % 2 == 0){
                System.out.print(arrays[i] + ", ");
            }
        }

        for (int i = 0; i < arrays.length-1; i++) {
            if(arrays[i]>0 && arrays[i] % 2 != 0){
                System.out.print(arrays[i] + ", ");
            }
        }

    }
}
