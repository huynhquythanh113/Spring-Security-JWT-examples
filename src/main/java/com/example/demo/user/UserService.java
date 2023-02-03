package com.example.demo.user;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.swing.text.BadLocationException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.error.ErrorMess;
import com.example.demo.role.Role;
import com.example.demo.role.RoleRepons;
import com.nimbusds.jose.proc.BadJOSEException;

import net.bytebuddy.asm.Advice.Return;


@Service
public class UserService {
	@Autowired
	private UserRepons userRepons;

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private RoleRepons roleRepons;
	public List<User> getList() {
		return userRepons.findAll();
	}

	@Transactional
	public User SaveUser(User user) {
		user.setPassWord(passwordEncoder.encode(user.getPassWord()));
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
	public User updateUser(User user) {
		Optional<User> user3 = Optional.ofNullable(userRepons.findById(user.getId()).orElseThrow(() -> new IllegalStateException("User is not exist")));
		User savedUser = user3.get();
		if (Objects.nonNull(savedUser)) {
			savedUser.setAge(user.getAge());
			savedUser.setName(user.getName());
			userRepons.save(savedUser);
			
		}
		return savedUser;
	}

	public User getUserByName(String name) {
		User user = userRepons.findUserByName(name).get();
		return user;
	}
	public String addRoleToUser (String username, String nameRole) {
		User user = userRepons.findByName(username);
		Role role = roleRepons.findByName(nameRole);
		user.getRoles().add(role);
		return "Success";
	}
	public Role saveRole(Role role) {
		return roleRepons.save(role);
	}
}
