package com.hemu.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	private static int UsersCount = 0;

	static {
		users.add(new User(++UsersCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++UsersCount, "Eve", LocalDate.now().minusYears(25)));
		users.add(new User(++UsersCount, "Jim", LocalDate.now().minusYears(20)));

	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		user.setId(++UsersCount);
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}

}
