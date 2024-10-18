import java.util.Scanner;

public class ArrMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eded = scan.nextInt();
        boolean netice = getValue(eded);
        System.out.println(netice);
    }
    private static boolean getValue(double a){
        if(a>0){
            return true;
        }
        else {
            return false;
        }
    }
}
