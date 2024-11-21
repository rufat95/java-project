import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sozu daxil edin: ");
        String word = scan.nextLine();

        word.trim().replaceAll("\\s+", " ").toUpperCase();
        char[] a = word.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 102){

            }
        }
    }
}
