package com.piPay.security.application.controller;

import com.piPay.security.user.dto.UserDTO;
import com.piPay.security.user.service.NotificationService;
import com.piPay.security.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserServiceImpl userService;
    private final NotificationService notificationService;


    @PostMapping("/register")
    public void register(@RequestBody UserDTO userDTO){
        userService.save(userDTO);
        notificationService.sendMessage(userDTO);

    }

    @PostMapping("/validate")
    public String validateTokenAndUsername(@RequestHeader("Authorization") String token){
        return userService.validateTokenAndUsername(token);
    }
}
