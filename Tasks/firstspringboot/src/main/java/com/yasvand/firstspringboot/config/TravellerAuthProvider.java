package com.yasvand.firstspringboot.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.yasvand.firstspringboot.entity.Traveller;
import com.yasvand.firstspringboot.repo.TravellerRepository;



@Component
public class TravellerAuthProvider implements AuthenticationProvider {

	@Autowired
	TravellerRepository travellerRepository;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String username = authentication.getName();
		String pwd = authentication.getCredentials().toString();
		Traveller traveller = travellerRepository.findByTravellerName(username);
		/*
		 * @Column(nullable = false,unique=true) private String travellername;
		 */
		System.out.println("Found Travel object" + traveller);
		if (traveller == null) {
			throw new StackOverflowError("No user got registered");
		} else if (pwd.equals(traveller.getTravellerPwd())) {
			List<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(traveller.getRoles()));
			return new UsernamePasswordAuthenticationToken(username, pwd, authorities);
		} else {
			System.out.println("I am a bad credentails");
			throw new StackOverflowError("Invalid Password");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {

		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
