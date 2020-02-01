package com.api.oauth2.example.controller;

import com.api.oauth2.example.model.Users;
import com.api.oauth2.example.model.UsersResult;
import com.api.oauth2.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("users")
public class UsersController {
    @Autowired
    UsersService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UsersResult> getById(@PathVariable("id") int id) {
        UsersResult user = userService.getUsersById(id);
        return new ResponseEntity<UsersResult>(user, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<UsersResult>> getAll() {
        List<UsersResult> listUser = userService.getAll();
        return new ResponseEntity<List<UsersResult>>(listUser, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsersResult> updateUser(@PathVariable("id") int id, @RequestBody Users users) {
        userService.updateUser(users, id);
        return new ResponseEntity<UsersResult>(HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<UsersResult> addUser(@RequestBody Users users) {
        userService.addUser(users);
        return new ResponseEntity<UsersResult>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UsersResult> deleteRest(@PathVariable("id") int id) {
        UsersResult rest2 = userService.getUsersById(id);
        userService.deleteUserById(id);
        return new ResponseEntity<UsersResult>(rest2, HttpStatus.OK);
    }

}
