package com.cinema.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.dao.UsersRepository;
import com.cinema.entity.Users;
import com.cinema.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersRepository repo;
	
	public Users saveUser(Users user) {
		return repo.save(user);
	}

	public Users fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	
	public Users fetchUserByEmailIdAndPassword(String emailId,String passward) {
		return repo.findByEmailIdAndPassward(emailId,passward);
	}
}
