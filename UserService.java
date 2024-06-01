package com.Libraryms.LibraryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Libraryms.LibraryEntity.User;
import com.Libraryms.LibraryRepository.UserRepository;



@Service
public class UserService {
	@Autowired	
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User user) {
		return userRepository.save(user);
	}

}
