import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();


        MyStack stack = new MyStack();
        System.out.println(stack.getCapacity() + " eded umumi sahe");
        stack.push("Rufat");
        stack.push("Imran");
        stack.push("Nasir");

        stack.showElements();
        System.out.println();

        stack.isEmpty();

        System.out.print("(" + stack.pop() + ")" + " Silindi --- ");
        stack.showElements();
        System.out.println();

        stack.clear();
        System.out.println(Arrays.toString(stack.array));
        System.out.println();

        stack.isEmpty();

    }
}