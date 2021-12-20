package com.cinema.dtotoentity;

import org.springframework.stereotype.Component;

import com.cinema.dto.HallDTO;
import com.cinema.entity.Hall;

@Component
public class HallDtoToEntity {
	public Hall convertHallDtoToEntity(HallDTO hallDTO) {
		Hall hall =  new Hall();
		hall.setHallDesc(hallDTO.getHallDesc());
		hall.setHallId(hallDTO.getHallId());
		hall.setTotalCapacity(hallDTO.getTotalCapacity());
		
		return hall;
	}
}
