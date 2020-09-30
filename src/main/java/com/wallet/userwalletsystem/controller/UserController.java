package com.wallet.userwalletsystem.controller;

import com.wallet.userwalletsystem.model.User;
import com.wallet.userwalletsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> userSignup(@RequestBody User user){
        User userId = userService.signupUser(user);
        return ResponseEntity.ok(userId);
    }

    @GetMapping("/login/{emailId}/{password}")
    public ResponseEntity<String> userLogin(@PathVariable String emailId, @PathVariable String password){
        User user = userService.loginUser(emailId, password);
        if(user !=null){
            return ResponseEntity.ok(user.getEmailId()+" logged in successfully");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid emailId or password");
    }
}
