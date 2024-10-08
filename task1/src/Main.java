public class Main {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n; i++) {
            int a = i % 7;
            if (a==0 && i > 7)
            {
                System.out.println(i);
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            int a = i % 2;
            int b = i % 3;
            int c = i % 5;

            if (a!=0 && b!=0 && c!=0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}