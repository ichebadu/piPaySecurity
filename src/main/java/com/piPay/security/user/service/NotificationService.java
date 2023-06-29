package com.piPay.security.user.service;

import com.google.gson.Gson;
import com.piPay.security.user.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class NotificationService {
    private final RabbitTemplate rabbitTemplate;
    private final static Gson GSON = new Gson();

    public void sendMessage(UserDTO userDTO){
        rabbitTemplate.convertAndSend("userRegisteredTopic","user.registered", GSON.toJson(userDTO));
    }
}
