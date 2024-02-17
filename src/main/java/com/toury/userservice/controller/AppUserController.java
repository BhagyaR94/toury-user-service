package com.toury.userservice.controller;

import com.toury.userservice.documents.AppUser;
import com.toury.userservice.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-service")
public class AppUserController {
    @Autowired
    AppUserService appUserService;

    @PostMapping("get-user-by-name")
    public AppUser getUserByName(String appUserName) {
        return appUserService.getAppUserByUserName(appUserName);
    }
}
