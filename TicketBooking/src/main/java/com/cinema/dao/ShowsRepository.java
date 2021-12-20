package com.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.cinema.entity.Shows;

public interface ShowsRepository extends CrudRepository<Shows, Integer> {

}
