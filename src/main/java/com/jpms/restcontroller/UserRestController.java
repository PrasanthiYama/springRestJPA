/**
 * 
 */
package com.jpms.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpms.model.User;
import com.jpms.repository.UserRepository;

/**
 * @author Administrator
 *
 */
@RestController
public class UserRestController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/userDetails",method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@RequestMapping(value="/userDetails/{id}",method = RequestMethod.GET)
	public Optional<User> getAllUsersById(@PathVariable("id") Integer id) {
		return userRepository.findById(id);
	}
	
	@RequestMapping(value="/deleteUser/{id}",method = RequestMethod.DELETE)
	public List<User> deleteUser(@PathVariable("id") Integer id) {
		 userRepository.deleteById(id);
		 return userRepository.findAll();
	}
	
	@RequestMapping(value="/updateUser/{id}",method = RequestMethod.PUT)
	public User updateUser(@RequestBody User newUser, @PathVariable("id") Integer id) {
		return  userRepository.findById(newUser.getUserId())
					 .map(user -> {
						 user.setAddress(newUser.getAddress());
						 user.setName(newUser.getName());
						 user.setUserId(newUser.getUserId());
						 user.setSalary(newUser.getSalary());
						 return userRepository.save(user);
					 }).orElseGet(() ->{
						 newUser.setUserId(id);
						 return userRepository.save(newUser);
					 });
	}
	
	@RequestMapping(value="/users",method = RequestMethod.POST)
	public List<User> saveUsers(@RequestBody User user) {
		 userRepository.save(user);
		 return userRepository.findAll();
	}
	
	

}
