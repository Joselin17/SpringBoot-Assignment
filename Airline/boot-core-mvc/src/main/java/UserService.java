package com.example.bootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.Optional;
 
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
 
    public boolean validateUser(String username, String password) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        return optionalUser.isPresent() && optionalUser.get().getPassword().equals(password);
    }
 
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }
 
    // You can add more user-related methods as needed
}