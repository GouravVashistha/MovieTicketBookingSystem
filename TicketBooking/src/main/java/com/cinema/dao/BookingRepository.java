package com.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
