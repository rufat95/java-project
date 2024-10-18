import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        String b = a.trim().replaceAll("\\s+", " ");
        System.out.println(b);

        int counter = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == ' '){
                counter++;
            }
        }
        System.out.println(counter+1);
    }
}
