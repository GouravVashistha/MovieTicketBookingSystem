package com.cinema.service;

import com.cinema.entity.Users;

public interface UserService {

	Users fetchUserByEmailId(String tempEmailId);

	Users saveUser(Users user);

	Users fetchUserByEmailIdAndPassword(String tempEmailId, String tempPass);

}
