package com.example.demo.user;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.error.ErrorMess;
import com.example.demo.role.Role;
import com.example.demo.role.RoleRepons;
import com.google.gson.Gson;

@Service
public class UserService {
	@Autowired
	private UserRepons userRepons;

	@Autowired
	private RoleRepons roleRepons;
	public List<User> getList() {
		return userRepons.findAll();
	}

	public User SaveUser(User user) {
		User a = userRepons.save(user);
		return a;
	}

	public String DeleteUser(Long idLong) {
		try {
			userRepons.deleteById(idLong);
			return "SuccessFully";
		} catch (Exception e) {
			return e.toString();
		}
	}

	public User getUser(Long idLong) {
		return userRepons.findById(idLong).orElseThrow(() -> new IllegalStateException("User is not exist"));
	}
	

	@Transactional
	public String updateUser(User user) {
		User user3 = userRepons.findById(user.getId()).get();
		if (user3 != null) {
			user3.setAge(user.getAge());
			user3.setName(user.getName());
			userRepons.save(user3);
			return user3.toString();
		} else {
			return user.toString() + " not exist";
		}

	}

	public User getUserByName(String name) {
		User user = userRepons.findUserByName(name).get();
		return user;
	}
	public void addRoleToUser (String username, String nameRole) {
		User user = userRepons.findByName(username);
		Role role = roleRepons.findByName(nameRole);
		user.getRoles().add(role);
	}
	public Role saveRole(Role role) {
		return roleRepons.save(role);
	}
}
