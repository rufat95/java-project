import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eded daxil edin: ");
        String s = scan.nextLine();

        int c = s.charAt(s.length() - 1) - 48;
        int b = s.charAt(s.length() - 2) - 48;
        int a = s.charAt(s.length() - 3) - 48;

        if(c % 2 == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        if(10*b + c % 4 == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        if(100*a + b + c % 8 == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }



    }
}
