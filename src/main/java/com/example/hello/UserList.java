package com.example.hello;

import java.util.ArrayList;

public class UserList {
    ArrayList<User> users;
//did not use this
    public UserList(ArrayList<User> users) {
        this.users = users;
        users.add(new User("ninx", "123456"));
        users.add(new User("masd", "123456"));
        users.add(new User("good", "123456"));
    }
}
