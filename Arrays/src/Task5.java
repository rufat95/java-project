import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sozu daxil edin: ");
        String word = scan.nextLine();

        char[] a = word.toCharArray();
        Arrays.sort(a);
        System.out.println(a);
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}
