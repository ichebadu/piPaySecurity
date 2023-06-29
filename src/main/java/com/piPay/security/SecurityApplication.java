package com.piPay.security;

import com.piPay.security.user.model.User;
import com.piPay.security.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SecurityApplication implements CommandLineRunner {

	private final UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("ichebadu","1234"));
		userRepository.save(new User("iche","1234"));
	}
}