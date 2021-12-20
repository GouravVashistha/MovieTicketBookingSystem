package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.dto.BookingDetailsDTO;
import com.cinema.dtotoentity.BookingDetailsDtoToEntity;
import com.cinema.exceptionhandler.Constants;
import com.cinema.service.BookingDetailService;

@RestController
public class BookingDetailsController {
 
	@Autowired
	BookingDetailService bookingDetailService;
	@Autowired
	BookingDetailsDtoToEntity bookingDetailsDtoToEntity;
	@PostMapping("/addBookingDetails")
	public String addBookingDetails(@RequestBody BookingDetailsDTO bookingDetails){
		 boolean isSeatAdded=bookingDetailService.addBookingDeatils(bookingDetailsDtoToEntity.convertBookingDetailsDtoToEntity(bookingDetails));
		  if(isSeatAdded) {
			  return Constants.SUCCESS;
		  }else {
			  return Constants.FAILED;
		  }
		  }
	
}
