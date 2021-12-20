package com.cinema.dto;

import com.cinema.entity.Booking;
import com.cinema.entity.SeatType;

public class BookingDetailsDTO {

	private Integer bookingDetailsId;

	private Booking booking;

	private SeatType seatTypeId;
	private Integer noOfSeats;

	public Integer getNoOfSeats() {
		return this.noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public SeatType getSeatTypeId() {
		return seatTypeId;
	}

	public void setSeatTypeId(SeatType seatTypeId) {
		this.seatTypeId = seatTypeId;
	}

	public Integer getBookingDetailsId() {
		return bookingDetailsId;
	}

	public void setBookingDetailsId(Integer bookingDetailsId) {
		this.bookingDetailsId = bookingDetailsId;
	}

}
