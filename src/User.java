public class User implements IUser {
    @Override
    public String getName() {
        return username;
    }

    @Override
    public String setName(String name) {
        username = name;
    }

    @Override
    public String setPassword(String password) {
        userpass=password;

    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if(userpass==password){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int getType() {
        return usertype;
    }
}
