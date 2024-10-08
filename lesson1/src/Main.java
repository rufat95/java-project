import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a  = scan.nextInt();

        if (a > 0 && a < 100)
        {
            if(a < 10)
            {
                switch (a)
                {
                    case 1:
                        System.out.println("bir");
                        break;
                    case 2:
                        System.out.println("iki");
                        break;
                    case 3:
                        System.out.println("uc");
                        break;
                    case 4:
                        System.out.println("dord");
                        break;
                    case 5:
                        System.out.println("bes");
                        break;
                    case 6:
                        System.out.println("alti");
                        break;
                    case 7:
                        System.out.println("yeddi");
                        break;
                    case 8:
                        System.out.println("sekkiz");
                        break;
                    case 9:
                        System.out.println("doqquz");
                        break;
                }
            }
            else if(a > 9 && a < 100)
            {
                int c = a/10;
                int b = a%10;

                switch (c){
                    case 1:
                        System.out.print("on");
                        break;
                    case 2:
                        System.out.print("iyirmi");
                        break;
                    case 3:
                        System.out.print("otuz");
                        break;
                    case 4:
                        System.out.print("qirx");
                        break;
                    case 5:
                        System.out.print("elli");
                        break;
                    case 6:
                        System.out.print("altmis");
                        break;
                    case 7:
                        System.out.print("yetmis");
                        break;
                    case 8:
                        System.out.print("seksen");
                        break;
                    case 9:
                        System.out.print("doxsan");
                        break;
                }
                switch (b){
                    case 1:
                        System.out.print(" bir");
                        break;
                    case 2:
                        System.out.print(" iki");
                        break;
                    case 3:
                        System.out.print(" uc");
                        break;
                    case 4:
                        System.out.print(" dord");
                        break;
                    case 5:
                        System.out.print(" bes");
                        break;
                    case 6:
                        System.out.print(" alti");
                        break;
                    case 7:
                        System.out.print(" yeddi");
                        break;
                    case 8:
                        System.out.print(" sekkiz");
                        break;
                    case 9:
                        System.out.print(" doqquz");
                        break;
                }
            }
        }else
        {
            System.out.println("eded yalniz 1 ve 99 araliginda");
        }

    }
}