package com.api.oauth2.example.dao;

import com.api.oauth2.example.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class UsersDaoImp implements UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UsersResult> getAll() {
        String sql = "select * from users order by id asc";
        List<UsersResult> users = jdbcTemplate.query(sql, new UsersMapper());
        return users;
    }

    @Override
    public UsersResult getUsersById(int id) {
        String sql2 = "select * from users where id = ?";
        UsersResult users2 = jdbcTemplate.queryForObject(sql2, new Object[]{id}, new UsersMapper());
        return users2;
    }

    @Override
    public void addUser(Users users) {
        String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?) ";
        jdbcTemplate.update(sql, users.getUsername(), users.getPassword(), users.getRole());
    }

    @Override
    public void updateUser(Users users, int id) {
        String sql = "update users set username=?, password=? ,role=? where id=?";
        jdbcTemplate.update(sql, users.getUsername(), users.getPassword(), users.getRole(), id);
    }

    @Override
    public void deleteUserById(int id) {
        String sql = "delete from users where id=?";
        jdbcTemplate.update(sql, id);
    }

}