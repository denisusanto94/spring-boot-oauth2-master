package com.api.oauth2.example.service;

import com.api.oauth2.example.dao.UsersDao;
import com.api.oauth2.example.model.Users;
import com.api.oauth2.example.model.UsersResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImp implements UsersService{

    @Autowired
    private UsersDao usersDao;

    @Override
    public List<UsersResult> getAll() {
        return usersDao.getAll();
    }

    @Override
    public UsersResult getUsersById(int id) {
        return usersDao.getUsersById(id);
    }

    @Override
    public void addUser(Users users) {
        usersDao.addUser(users);
    }

    @Override
    public void updateUser(Users users, int id) {
        usersDao.updateUser(users, id);
    }

    @Override
    public void deleteUserById(int id) {
        usersDao.deleteUserById(id);
    }

}
