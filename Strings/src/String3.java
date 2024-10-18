import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int index1 = scan.nextInt();
        int index2 = scan.nextInt();

        String b = a.trim().replaceAll("\\s+", " ");
        StringBuilder strB = new StringBuilder(b);
        strB.delete(index1, index2);
        System.out.println(strB.toString());

    }
}
