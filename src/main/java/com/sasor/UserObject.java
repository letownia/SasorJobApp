package com.sasor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    private String userName;

    private String password; // Change to char[] in future for safety
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
  //  private List<UserGroup> myUserGroups;

    public User(String userName, String password, String firstName, String lastName, LocalDateTime dateOfBirth) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
     //   this.myUserGroups = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    public List<UserGroup> getMyUserGroups() {
//        return myUserGroups;
//    }
//
//    public void setMyUserGroups(List<UserGroup> myUserGroups) {
//        this.myUserGroups = myUserGroups;
//    }

    public void updateWithNewUserData(User newUserData){
    }

    public static boolean validateUser(User user){
        if(user.getUserName() == null){
            return false;
        }
        if(user.getDateOfBirth() == null){
            return false;
        }
        if(user.getFirstName() == null){
            return false;
        }
        if(user.getLastName() == null){
            return false;
        }
        if(user.getPassword() == null){
            return false;
        }
        return true;
    }

}
