package com.restful.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	private static List<User> users = new ArrayList<>();
	private static int userCount = 3;
	
	static {
		users.add(new User(1, "Jack", new Date()));
		users.add(new User(2, "Jill", new Date()));
		users.add(new User(3, "Hill", new Date()));
	}
	
	public List<User> getAllUsers() {
		return users;
	}
	
	public User getUserById(Integer id) {
		if (id == null)
			return null;
		for(User user: users) {
			if (user.getId().equals(id))
				return user;
		}
		throw new UserNotFoundException("No User found with id "+id);
	}
	
	public User saveUser(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

}
