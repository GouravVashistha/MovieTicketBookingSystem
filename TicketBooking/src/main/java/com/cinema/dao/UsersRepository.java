package com.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	public Users findByEmailId(String emailId);
	public Users findByEmailIdAndPassward(String emailId,String passward);
}
