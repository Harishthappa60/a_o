package com.example.a_o.controller;

import com.example.a_o.model.BankUser;
import com.example.a_o.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping ("/bankUser_add")
    public BankUser addUser(@RequestBody BankUser bankUser){
        return service.addUser(bankUser);
    }

    @GetMapping ("/bankUser_read")
    public List<BankUser> getAllUser(){
        return service.getAllUser();
    }

    @PutMapping("/User_update")
    public String updateUser(@RequestParam String dob, long id){
        return service.updateUser(dob,id);
    }

    @DeleteMapping("/bankUser_delete")
    public String deleteUser(long id){
        return service.deleteUser(id);
    }

}
