package com.test.demo.controller;


import com.test.demo.model.User;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/34")
    @ResponseBody
    public String getStr() {
        return "123";
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser() {
        return ResponseEntity.ok(userService.findUser());
    }


}
