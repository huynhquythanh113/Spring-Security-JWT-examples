package com.example.demo.security;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	private final TokenService aService;

	public AuthController(TokenService aService) {
		super();
		this.aService = aService;
	}

	@PostMapping("/token")
	public String token(Authentication authentication) {
		String tokenString = aService.generateToken(authentication);
		return tokenString;
	}

}
