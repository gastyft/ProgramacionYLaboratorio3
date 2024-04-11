package org.example.services;

import org.example.model.User;

import java.util.List;

public interface IUser {
    public void createUser(String name, String adress, int phone);

    void editUser(String name, String address, int phone);

    void deleteUser(String name);

    User searchUser(String name);
    public List<User> obteinListUser();
}
