package com.cinema.dtotoentity;

import org.springframework.stereotype.Component;

import com.cinema.dto.BookingDetailsDTO;
import com.cinema.entity.BookingDetails;

@Component
public class BookingDetailsDtoToEntity {
	public BookingDetails convertBookingDetailsDtoToEntity(BookingDetailsDTO bookingDetailsDTO) {
		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setBooking(bookingDetailsDTO.getBooking());
		bookingDetails.setBookingDetailsId(bookingDetailsDTO.getBookingDetailsId());
		bookingDetails.setNoOfSeats(bookingDetailsDTO.getNoOfSeats());
		bookingDetails.setSeatTypeId(bookingDetailsDTO.getSeatTypeId());
		return bookingDetails;
		
	}
}
