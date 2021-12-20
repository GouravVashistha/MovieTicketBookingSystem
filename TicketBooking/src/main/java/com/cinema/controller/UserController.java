package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.dto.UsersDTO;
import com.cinema.dtotoentity.UserDtoToEntity;
import com.cinema.entity.Users;
import com.cinema.exception.EmailAlreadyExistException;
import com.cinema.exception.EmailIdFormatException;
import com.cinema.exception.PasswordNotMatchException;
import com.cinema.exception.WrongCredentialsException;
import com.cinema.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	@Autowired
	UserDtoToEntity userDtoToEntity;

	@PostMapping("/usersregistration")
	public Users registerUser(@RequestBody UsersDTO userDto) throws EmailAlreadyExistException, PasswordNotMatchException, EmailIdFormatException {
		String tempEmailId = userDto.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			Users userObj = service.fetchUserByEmailId(tempEmailId);
			if (userObj != null) {
				throw new EmailAlreadyExistException("User with " + tempEmailId + " is already Exist");
			}
		}
		String tempPassward = userDto.getPassward();
		String tempCPassward = userDto.getcPassward();
		if(tempCPassward != null && !tempCPassward.equals(tempPassward)) {
		throw new PasswordNotMatchException();
		}
		if(userDto.getEmailId().isEmpty() || userDto.getEmailId().isBlank() || !userDto.getEmailId().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
			throw new EmailIdFormatException("Email Id is Wrong format");
			}

		Users userObj = userDtoToEntity.usersConvertUsersDtoEntity(userDto);
		
		return service.saveUser(userObj);
		
	}

	@PostMapping("/Userlogin/{emailId}/{password}")
	public String loginUser(@PathVariable String emailId, @PathVariable String password) throws WrongCredentialsException{
		String tempEmailId = emailId;
		String tempPass = password;

		Users userObj = null;
		if (tempEmailId != null && tempPass != null) {
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}

		if (userObj == null) {
			throw new WrongCredentialsException("WrongCredentials");
		}
		return "Login Successfull";
	}
}
