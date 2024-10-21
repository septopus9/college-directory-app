package com.college.directory.service;

import com.college.directory.models.Role;
import com.college.directory.models.StudentProfile;
import com.college.directory.models.User;
import com.college.directory.repositories.StudentProfileRepository;
import com.college.directory.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public User  createUser(User user){
        User savedUser = userRepository.save(user);
        if (savedUser.getRole()==Role.STUDENT){
            StudentProfile studentProfile = new StudentProfile();
            studentProfile.setUser(savedUser);
            studentProfileRepository.save(studentProfile);
        }
        return savedUser;
    }












}
