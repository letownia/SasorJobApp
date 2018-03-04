package com.sasor;

import com.sasor.User;
import com.sasor.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @RequestMapping("/users/{userName}")
    public User getUser(@PathVariable String userName){
        return userService.getUser(userName);
    }

    @RequestMapping(method= RequestMethod.PUT,  value="/users")
    public void createUser(@RequestBody User newUser){
        //
    }

    @RequestMapping(method= RequestMethod.PUT,  value="/users/{userName}")
    public User updateUser(@PathVariable String userName, @RequestBody User newUser){
        return userService.getUser(userName);
    }

    @RequestMapping(method= RequestMethod.DELETE,  value="/users/{userName}")
    public User deleteUser(@PathVariable String userName){
        return userService.getUser(userName);
    }



}
