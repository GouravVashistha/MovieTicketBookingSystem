package com.cinema.dtotoentity;

import org.springframework.stereotype.Component;

import com.cinema.dto.SeatTypeDTO;
import com.cinema.entity.SeatType;

@Component
public class SeatTypeDtoToEntity {
	 public SeatType convertSeatTypeDtoToEntity(SeatTypeDTO seatTypeDto) {
		 SeatType st = new SeatType();
		 st.setSeatFare(seatTypeDto.getSeatFare());
		 st.setSeatTypeDesc(seatTypeDto.getSeatTypeDesc());
		 st.setSeatTypeId(seatTypeDto.getSeatTypeId());
		 
		 return st;
	 }
}
