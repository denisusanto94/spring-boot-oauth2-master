package com.api.oauth2.example.dao;

import com.api.oauth2.example.model.Users;
import com.api.oauth2.example.model.UsersResult;

import java.util.List;

public interface UsersDao {
    List<UsersResult> getAll();
    UsersResult getUsersById(int id);
    void addUser(Users users);
    void updateUser(Users users, int id);
    void deleteUserById(int id);
}