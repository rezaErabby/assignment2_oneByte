package com.example.demo.login.service;

import com.example.demo.login.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}
