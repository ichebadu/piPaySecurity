package com.piPay.security.user.service;

import com.piPay.security.user.dto.UserDTO;
import com.piPay.security.user.exception.UserNotFoundException;
import com.piPay.security.user.model.User;
import com.piPay.security.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl {
    private final UserRepository userRepository;


    public String validateTokenAndUsername(String token){
        return userRepository.findById(token)
                .orElseThrow(()-> new UserNotFoundException(token)).getUsername();
    }

    public void save(UserDTO userDTO) {
        User user = new User(userDTO.getUsername(),userDTO.getPassword());
        userRepository.save(user);
    }
}