import java.util.*;

public class Main {
    public static void main(String[] args) {

        User murad = new User();
        murad.role = Role.SUPER_ADMIN;

        User imran = new User();
        imran.role = Role.ADMIN;

        User rufat = new User();
        rufat.role = Role.USER;

        Deque<Integer> ints = new ArrayDeque<>();

        ints.push(56);
        ints.push(1);
        ints.push(2);
        ints.push(3);
        ints.push(4);
        ints.push(78);

        Map<String, String> maps = new  HashMap<>();

        maps.put("1", "Nasir");
        maps.put("2", "Murad");
        maps.put("2", "Rufat");

        System.out.println(maps);


    }
}