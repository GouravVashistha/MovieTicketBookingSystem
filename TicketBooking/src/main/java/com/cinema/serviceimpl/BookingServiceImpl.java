package com.cinema.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.dao.BookingRepository;
import com.cinema.entity.Booking;
import com.cinema.service.BookingService;
@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
	BookingRepository bookingRepo;
	@Override
	public Boolean addBooking(Booking booking){
		if(booking.getShows()!=null&&booking.getUser()!=null&&booking.getBookedDate()!=null&&booking.getShowDate()!=null) {
			bookingRepo.save(booking);
			return true;
		}
		return false;
	}

}
