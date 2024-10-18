import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ad daxil edin: ");
        String name = scan.nextLine();
        System.out.print("Password daxil edin: ");
        String password = scan.nextLine();

        String nameHash = name;
        String passwordHash = "";
        for (int i = 0; i < password.length(); i++) {
            passwordHash += ((char) (password.charAt(i)+3));
        }

        System.out.println("Siz ugurla daxil oldunuz Hormetli " + nameHash);
        System.out.println("Parolunuz: " + passwordHash);
    }
}
