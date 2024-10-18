import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        char[] arr = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            arr[i] += sentence.charAt(i);
        }
//      [f,f,f,t,f,f,f,f,t,f,f,f]
//      char[] arr = {'s', 'a', 'l', 'a', 'm', ' ', 'o', 'l', 's', 'u', 'n', ' ', 'e', 'l', ' ', 'e', 'h', 'l', 'i', 'n', 'e'};
        boolean[] checked = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (!checked[i]){
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        count++;
                        checked[j] = true;
                    }
                }
                if(count > 1){
                    System.out.println(arr[i] + " -> " + count + "defe");
                }
                if(count == 1){
                    System.out.println(arr[i] + " -> " + count + "defe");
                }
            }
        }
    }
}