package org.example.services;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUser {

    List<User> userList = new ArrayList<>();

    @Override
    public void createUser(String name, String address, int phone) {
        User user = new User(name, address, phone);
        userList.add(user);
    }

    @Override
    public List<User> obteinListUser() {
        return userList;
    }

    @Override
    public void editUser(String name, String address, int phone) {

        for (User user : userList) {
            if (user.getName().equals(name)) {
                user.setName(name);
                user.setAddress(address);
                user.setPhone(phone);
                return;
            }
        }
    }

    @Override
    public User searchUser(String name) {
        User user = null;
        for (User user1 : userList) {
            if (user1.getName().equals(name))
                user = user1;
        }
        return user;
    }

    @Override
    public void deleteUser(String name) {
        User user = searchUser(name);
        userList.remove(user);
    }
}
