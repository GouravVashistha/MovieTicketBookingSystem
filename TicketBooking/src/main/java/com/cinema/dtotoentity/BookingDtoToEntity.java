package com.cinema.dtotoentity;

import org.springframework.stereotype.Component;

import com.cinema.dto.BookingDTO;
import com.cinema.entity.Booking;

@Component
public class BookingDtoToEntity {
	public Booking convertbookingDtoToEntity(BookingDTO bookingDTO) {
		Booking booking = new Booking();
		booking.setBookedDate(bookingDTO.getBookedDate());
		booking.setBookingId(bookingDTO.getBookingId());
		booking.setShowDate(bookingDTO.getShowDate());
		booking.setShows(bookingDTO.getShows());
		booking.setUser(bookingDTO.getUser());
		
		return booking;
	
	}
	
	
}
