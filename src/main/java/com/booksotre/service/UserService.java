package com.booksotre.service;

import com.booksotre.domain.User;
import com.booksotre.domain.security.PasswordResetToken;

public interface UserService
{
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
}
