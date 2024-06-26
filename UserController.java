package com.Libraryms.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Libraryms.LibraryEntity.User;
import com.Libraryms.LibraryService.UserService;



@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUsers() {
		return userService.findAll();

	}

	 @PostMapping
	    public ResponseEntity <User> addUser(@RequestBody User user) {
	        User savedUser = userService.save(user);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	    }
}
