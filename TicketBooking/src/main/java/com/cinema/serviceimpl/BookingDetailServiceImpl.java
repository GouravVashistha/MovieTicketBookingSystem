package com.cinema.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.dao.BookingDetailsRepository;
import com.cinema.entity.BookingDetails;
import com.cinema.service.BookingDetailService;

@Service
public class BookingDetailServiceImpl implements BookingDetailService {
	@Autowired
	BookingDetailsRepository bookingDetailsRepo;

	@Override
	public Boolean addBookingDeatils(BookingDetails bookingDetails) {
		if (bookingDetails.getSeatTypeId() != null && bookingDetails.getBooking() != null
				&& bookingDetails.getNoOfSeats() != 0) {
			bookingDetailsRepo.save(bookingDetails);
			return true;
		}

		return false;

	}

}
