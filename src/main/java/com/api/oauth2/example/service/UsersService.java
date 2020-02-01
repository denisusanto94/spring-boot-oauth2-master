package com.api.oauth2.example.service;

import com.api.oauth2.example.model.Users;
import com.api.oauth2.example.model.UsersResult;

import java.util.List;

public interface UsersService {
    List<UsersResult> getAll();
    UsersResult getUsersById(int id);
    void addUser(Users users);
    void updateUser(Users users, int id);
    void deleteUserById(int id);
}