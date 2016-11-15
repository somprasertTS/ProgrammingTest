import java.util.ArrayList;

public class Users {
    private int size;
    int usertype;
    String username;
    String userpass;

    private ArrayList<IUser> userList;

    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) {
        Users a=new Users();
        a.usertype = type;
        a.username = name;
        a.userpass=password;
        add(a);
    }

    // Add new user to repository
    public void add(IUser user) {
        userList[count(userList)+1]=user;
        size++;
    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user)  {
        for (int index = 0; index < size; index++){
            if(user.equals(userList[index])){
                userList[index]=null;
                break;
            }
        }throw RuntimeException;
    }

    // Return true if the user is in the list
    public boolean exists(IUser user) {
        for (int index = 0; index < size; index++){
            if(user.equals(userList[index])){
                return true;
                break;
            }
        }
        return false;
    }

    // Return number of user in the list
    public int count() {
        return size;
    }

    // Return number of user in the list, according to type
    public int countByType(int type) {
        int typecount;
        for (int index = 0; index < size; index++){
            if(usertype=type){
                typecount++;
            }
        }
        return typecount;
    }
}
