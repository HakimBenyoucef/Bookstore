package com.booksotre.utility;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityUtility 
{
	private static final String SALT = "salt"; // should be protected carefully
	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
	}
	
	@Bean
	public static String randomPassword() throws NoSuchAlgorithmException
	{
		String SALTCHARS = "ABDEFGHIJKLMNOPQRSTUVWXZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random random = SecureRandom.getInstanceStrong();
		
		while(salt.length() <18)
		{
			int index = random.nextInt()*SALTCHARS.length();
			salt.append(SALTCHARS).charAt(index);
		}
		return salt.toString();
	} 

}
