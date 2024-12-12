import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        String a = "salam";
        System.out.println(task(a));
    }

    public static int task(String a){
        Map<Character, Integer> num = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if(num.containsKey(b)){
                return num.get(b);
            }
            num.put(b, i);
        }
        System.out.println(num);
        return 0;
    }
}
