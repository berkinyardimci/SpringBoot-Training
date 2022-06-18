package com.hoaxify.ws.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	
	UserRepository userRepository;
	
	//bir classta sadece bi constructor varsa Autowirde kullanmamız çok gerekli değil
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public void save(User user) {
		userRepository.save(user);
	}
	
}
