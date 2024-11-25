import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int number = scanner.nextInt();

        System.out.println("Ədəddər");
        while (number != 1) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
        }
        System.out.println(number);
    }
}

