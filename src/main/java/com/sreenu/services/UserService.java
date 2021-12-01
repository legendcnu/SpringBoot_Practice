package com.sreenu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.sreenu.entity.User;
import com.sreenu.exceptions.UserExistsException;
import com.sreenu.exceptions.UserNotFoundException;
import com.sreenu.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User createUser(User user) throws UserExistsException {
		
		User existUser=userRepository.findByUsername(user.getUsername());
		
		if(existUser!=null) {
			throw new UserExistsException("User Already Exists!!!");
		}
		
		return userRepository.save(user);
	}
	
	public Optional<User> getUserById(Long id) throws UserNotFoundException {
		Optional<User> user= userRepository.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFoundException("user not found in user Repository");
		}
		return user;
	}
	
	
	public User updateUserById(Long id,User user) throws UserNotFoundException {
		Optional<User> optionalUser= userRepository.findById(id);
		if(!optionalUser.isPresent()) {
			throw new UserNotFoundException("user not found in user Repository, Provide correct user id");
		}
		user.setId(id);
		return userRepository.save(user);
	}
	
	
	public void deleteUserById(Long id){
		if(!userRepository.findById(id).isPresent()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"user not found in user Repository, Provide correct user id");
			
		}
		userRepository.deleteById(id);
	}
	
	
	public User getUserByUsername(String name) {
		return userRepository.findByUsername(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
