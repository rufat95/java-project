import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        String b = a.trim().replaceAll("\\s+", " ").toUpperCase();
        System.out.println(b);

        int counter = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'A'
                || b.charAt(i) == 'E'
                || b.charAt(i) == 'I'
                || b.charAt(i) == 'O'
                || b.charAt(i) == 'U'
                || b.charAt(i) == 'Y'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
