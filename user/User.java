package user;

import java.util.HashSet;
import java.util.Set;

public class User {
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String customerUserName, String customerPassword, int customAge, Set<Integer> orderIDs){
        this.username = customerUserName;
        this.password = customerPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }

    public static void main(String[] args) {
        Set a = new HashSet();
        a.add(1212);

        User atul = new User("klovster", "klovster17#9", 10, a);


    }
}
