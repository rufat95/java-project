import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sozu daxil edin: ");
        String word = scan.nextLine();

        char[] a = word.toCharArray();
        int[] b = new int[word.length()];


        for (int i = 0; i < a.length; i++) {
            if (a[i] == 102){
                b[i] += i;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
