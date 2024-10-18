import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = "123";

        Integer d = Integer.valueOf(a);
        System.out.println(d+1);

//        int result = 0;
//        int n = 1;
//        for (int i = a.length()-1; i >= 0 ; i--) {
//            result += ((int)a.charAt(i)-48)*n;
//            n*=10;
//        }
//        System.out.println(result+1);
    }
}

