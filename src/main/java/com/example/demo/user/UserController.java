package com.example.demo.user;

import org.aspectj.apache.bcel.generic.LineNumberGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.role.Role;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

import lombok.Data;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/user")
@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	@GetMapping
	List<User> getList(){
		return  userService.getList();
	}
	@PostMapping
	public User Insert(@RequestBody User user) {
		  return userService.SaveUser(user);
	}
	@DeleteMapping("/{id}")
	public String user (@PathVariable Long id) {
		return userService.DeleteUser(id);
	}
	@GetMapping("/{id}")
	public User getUser (@PathVariable Long id) {
		return userService.getUser(id);
	}
	@GetMapping("/get/{name}")
	public User getUserByName (@PathVariable String name) {
		return userService.getUserByName(name);
	}
	@PutMapping
	public String Update(@RequestBody User newuser) {	
		return userService.updateUser(newuser);
	}
	@PostMapping("/role")
	public ResponseEntity<Role>saveRole(@RequestBody Role role){
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/user/role").toUriString());
		return ResponseEntity.created(uri).body(userService.saveRole(role));
	}
	@PostMapping("/role/addtouser")
	public ResponseEntity<?>saveRole(@RequestBody RoleToUserForm role){
		userService.addRoleToUser(role.getUsername(),role.getRolename());
		return ResponseEntity.ok().build();
	}

}
@Data
class RoleToUserForm{
	private String username;
	private String rolename;
	public String getUsername() {
		return this.username;
	}
	public String getRolename() {
		return this.rolename;
	}
}
