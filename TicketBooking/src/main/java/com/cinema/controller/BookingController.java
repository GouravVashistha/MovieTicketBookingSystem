package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.dto.BookingDTO;
import com.cinema.dtotoentity.BookingDtoToEntity;
import com.cinema.exception.BookingNotAddedException;
import com.cinema.exceptionhandler.Constants;
import com.cinema.service.BookingService;

@RestController
public class BookingController {
	@Autowired
      BookingService  bookingService;
	@Autowired
	BookingDtoToEntity bookingDtoToEntity;
	  @PostMapping("/addBooking")
	  public String addBooking(@RequestBody BookingDTO booking) throws BookingNotAddedException {
		  boolean isBookingAdded=bookingService.addBooking(bookingDtoToEntity.convertbookingDtoToEntity(booking));
		  if(isBookingAdded) {
			  return Constants.SUCCESS;
		  }else {
			  throw new BookingNotAddedException();
		  }
		  }
}
