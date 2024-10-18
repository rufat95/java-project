import java.sql.Time;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eded = 144;

        for (int i = 1; i <= eded; i++) {
            int sadeBolen = eded % i;
            if (sadeBolen == 0){
                System.out.println(i);
            }
        }


        int b = 1;
        for (int i = 1; i <= 5; i++) {
            b = b * i;
        }
        System.out.println(b);

        Scanner in = new Scanner(System.in);
    }
}