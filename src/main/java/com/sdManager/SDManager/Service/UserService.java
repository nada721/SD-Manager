package com.sdManager.SDManager.Service;

import com.sdManager.SDManager.Entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    User getUserById(Long assigneeId) {
        User user = new User();
        return user;
    }
}
