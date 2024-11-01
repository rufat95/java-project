import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Rufat", "123");
        User user2 = new User("Shamil", "123");
        User user3 = new User("Elvin", "123");

        UserService userService = new UserService();

        userService.register(user1);
        userService.register(user2);
        userService.register(user3);

        for(User tempUser : UserService.users){
            if(tempUser == null) break;

            System.out.println(tempUser);
        }
        System.out.println("///////////////////////////////////////////");

//        System.out.println("Daxil olun !");
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Ad daxil edin");
//        String username = scan.nextLine();
//        System.out.print("Parolu yazin");
//        String password = scan.nextLine();
        

    }
}