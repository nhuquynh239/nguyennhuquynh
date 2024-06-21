package com.example.NguyenNhuQuynh7954.services;

import com.example.NguyenNhuQuynh7954.entity.User;
import com.example.NguyenNhuQuynh7954.repository.IRoleRepository;
import com.example.NguyenNhuQuynh7954.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user){

        userRepository.save(user);
        Long userId=userRepository.getUserIdByUsername(user.getUsername());
        Long roleId=roleRepository.getRoleIdByName("USER");
        if(roleId!=0 && userId!=0){
            userRepository.addRoleToUser(userId,roleId);
        }

    }
}
