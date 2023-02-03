package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.User;
import com.example.demo.user.UserLoginService;
import com.example.demo.user.UserService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/auth")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager ;
	@Autowired
	private  UserLoginService userLoginService ;
	@Autowired
	private  JwtUtil jwtUtil ;
	@PostMapping
	public ResponseEntity<String> authencicate (
		@RequestBody AuthenticatorRequest author 	){
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(author.getEmail(), author.getPassword()));
		UserDetails user = userLoginService.loadUserByUsername(author.getEmail());
		if(user!=null) {
			return ResponseEntity.ok(jwtUtil.generateToken(user));
		}
		return ResponseEntity.ok("Some error has wrong");
//		return ResponseEntity.ok(userLoginService.getUserByName(author.getEmail()));
	}
	@PostMapping("/user")
	public ResponseEntity<UserDetails> authencicate1 (
		@RequestBody AuthenticatorRequest author 	){
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(author.getEmail(), author.getPassword()));
		UserDetails user = userLoginService.loadUserByUsername(author.getEmail());
		if(user!=null) {
			return ResponseEntity.ok(user);
		}
		return ResponseEntity.ok(null);
//		return ResponseEntity.ok(userLoginService.getUserByName(author.getEmail()));
	}
	  @PreAuthorize("hasAuthority('ROLE_USER')")
	    @GetMapping("/secure")
	    public String secure() {
	        return "This is secured!";
	    }
	  @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	    @GetMapping("/secure1")
	    public String secure1() {
	        return "This is secured admin!";
	    }
}
