public class UserValidasiya {

    public boolean validationUserName(String userName){
        if(userName == null || userName.length() > 10 || userName.isBlank()){
            return false;
        }
        return true;
    }
}
