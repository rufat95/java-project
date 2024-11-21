import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Print print = new Print();
        int counter = 0;

        while (true){
            try {
                System.out.print("Soz daxil edin: ");
                Scanner scan = new Scanner(System.in);
                String word = scan.nextLine();
                print.printString(word);

            }catch (Exception e){
                counter++;
                System.out.println(e.getMessage());
                if(counter > 2){
                    System.out.println("Ay kisi... AGILLO OL!!!");
                }
            }
        }
    }
}