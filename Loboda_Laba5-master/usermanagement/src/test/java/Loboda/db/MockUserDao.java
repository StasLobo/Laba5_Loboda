package Loboda.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Loboda.User;

public class MockUserDao implements UserDao {

	private long id = 0;
	private Map<Long, User> users = new HashMap<>();
	
	public User create(User user) throws DatabaseExeption {
		Long currentId = new Long(++id);
		user.setId(currentId);
		users.put(currentId, user);
		return user;
	}

	public User find(Long id) throws DatabaseExeption {
		return (User) users.get(id);
	}

	public void update(User user) throws DatabaseExeption {
	Long currentId = user.getId();
	users.remove(currentId);
	users.put(currentId, user);
	}
	
	public void delete(User user) throws DatabaseExeption {
		Long currentId = user.getId();
		users.remove(currentId);

	}
	public Collection<User> findAll() throws DatabaseExeption {
		return users.values();
	}
	public void setConnectionFactory(ConnectionFactory connectionFactory) {
	}

	@Override
	public Collection<User> find(String firstName, String lastName) throws DatabaseExeption {
		throw new UnsupportedOperationException();
	}
}
