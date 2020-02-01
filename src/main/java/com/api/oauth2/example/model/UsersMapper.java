package com.api.oauth2.example.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersMapper implements RowMapper<UsersResult> {
    @Override
    public UsersResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Users users = new Users();
        users.setId(rs.getInt("id"));
        users.setUsername(rs.getString("username"));
        users.setRole(rs.getString("role"));

        UsersResult usersResult = new UsersResult();
        usersResult.setId(rs.getInt("id"));
        usersResult.setUsername(rs.getString("username"));
        usersResult.setRole(rs.getString("role"));
        return usersResult;
    }
}
