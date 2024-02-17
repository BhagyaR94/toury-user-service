package com.toury.userservice.services;

import com.toury.userservice.documents.AppUser;
import com.toury.userservice.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    AppUserRepository userRepository;

    public AppUser getAppUserByUserName(String userName) {
        return userRepository.findItemByName(userName);
    }
}
