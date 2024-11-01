public class UserService {
    public static final User[] users = new User[100];
    private static int pointer = 0;

    public void register(User user){
        UserValidasiya userValidasiya = new UserValidasiya();

        if(!userValidasiya.validationUserName(user.getUserName())){
            throw new RuntimeException("Invalid username");
        }

        users[pointer++] = user;

        System.out.println("User registered successfully: " + user.getUserName());
    }

    public void login(String username, String password){

    }


}
