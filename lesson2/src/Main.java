public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("////////////////");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("////////////////");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println("");
        }
        System.out.println("////////////////");
        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * i - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////");
        for (int i = 0; i <=a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * (a - i) - 1); c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}