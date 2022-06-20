package com.hoaxify.ws;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.hoaxify.ws.user.UniqueUsername;
import com.hoaxify.ws.user.User;
import com.hoaxify.ws.user.UserRepository;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String>{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		User user = userRepository.findByUsername(username);
		if(user != null) {
			return false;
		}
		return true;
	}
}
