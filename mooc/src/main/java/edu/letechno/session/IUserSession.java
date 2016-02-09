package edu.letechno.session;

import javax.ejb.Remote;

import edu.letechno.entity.User;

@Remote
public interface IUserSession {
	
	public void CreateUser(User usr);
	public void DropUser(User usr);
	public User login(String login, String password);
	public void logout();
	public User getUserById(int id);
}