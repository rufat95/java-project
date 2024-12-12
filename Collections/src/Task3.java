import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
