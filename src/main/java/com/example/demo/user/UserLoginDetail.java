package com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.role.Role;

import java.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Data
@AllArgsConstructor
public class UserLoginDetail implements UserDetails {
    User user;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//    	if(user.getRoles().size()>0) {
//    		List<GrantedAuthority> author= new ArrayList<>();
//        	for (Role role : user.getRoles()) {
//        		author.add(new SimpleGrantedAuthority(role.getName()));
//        	}
//        	System.out.println(user.getRoles());
//            return author;
//    	}
//    	System.out.println(user.getRoles());
    	List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
    		
        list.add(new SimpleGrantedAuthority("ROLE_USER"));
        list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

    	return list;
    	
    }

    @Override
    public String getPassword() {
        return user.getPassWord();
    }

    @Override
    public String getUsername() {
        return user.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    public UserLoginDetail(User user) {
    	this.user = user;
    }
}
