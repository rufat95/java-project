import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        int a = 1223;
        System.out.println(task(a));
    }

    public static boolean task(int a){
        Set<Integer> num = new HashSet<>();
        while (a != 0){
            int result = a % 10;
            int number = a / 10;
            if(num.contains(result)){
                return true;
            }
            num.add(result);
            a = number;
        }
        return false;
    }
}
