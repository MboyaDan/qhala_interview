package com.aim.app.configs.events;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.aim.app.accounts.models.User;
import com.aim.app.accounts.models.User.Role;
import com.aim.app.accounts.repositories.UserRepository;

@Component
public class SysDefaultsRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SysDefaultsRunner.class);

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	@Autowired
	public SysDefaultsRunner(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public void run(String... args) throws Exception {

		Optional<User> user = userRepository.findByEmail("test@admin.com");

		if (!user.isPresent()) {

			User newUser = new User();
			newUser.setEmail("test@admin.com");
			newUser.setFirstName("Admin");
			newUser.setLastName("aDM");
			newUser.setPassword(passwordEncoder.encode("123890test"));
			newUser.setPhoneNumber("254723456789");
			newUser.setRole(Role.ROLE_USER);
			
			userRepository.save(newUser);
			
			logger.info("default user created");

		}

	}

}
