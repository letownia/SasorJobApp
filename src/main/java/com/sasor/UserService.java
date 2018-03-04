package com.sasor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
//
//    List<User> allUsers = new ArrayList<>(Arrays.asList(new User("letownia", "password","Borg","Lojasiewicz",
//            LocalDateTime.now())));

    @Autowired UserRepository userRepository;

    public List<User> getUserList(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUser(String userName){
        Optional<User> found = userRepository.findById(userName);
        if(found.isPresent()){
            return found.get();
        }else{
            return null;
        }
        //return allUsers.stream().filter( x -> x.getUserName().equals(userName)).findFirst().orElse(null);
    }

    public void updateUser(String userName, User user){
        User oldUser = getUser(userName);
        if(oldUser != null){
            //Do something!
        }
    }

    public void createUser(User user){
        if(getUser(user.getUserName()) != null){
            throw new RuntimeException("User already exists");
        }else{
            userRepository.save(user);
        }
    }

    public void deleteUser(String userName){
        userRepository.deleteById(userName);
    }
}
