package com.cinema.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.dao.SeatTypeRepository;
import com.cinema.entity.SeatType;
import com.cinema.service.SeatTypeService;

@Service
public class SeatTypeServiceImpl implements SeatTypeService {
	@Autowired
	SeatTypeRepository seatTypeRepo;

	@Override
	public Boolean addSeatType(SeatType seattype) {
		if (seattype.getSeatFare() >= 0 && !seattype.getSeatTypeDesc().isEmpty() && seattype.getSeatTypeId() != 0) {
			seatTypeRepo.save(seattype);
			return true;
		} else {
			return false;
		}
	}

}
