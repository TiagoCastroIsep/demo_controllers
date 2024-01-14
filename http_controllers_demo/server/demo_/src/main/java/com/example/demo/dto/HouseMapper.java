package com.example.demo.dto;

import com.example.demo.domain.House;
import com.example.demo.dto.HouseDTO;

public class HouseMapper {
    public House houseDto2house(HouseDTO houseDTO) {
        return new House(houseDTO.getName(), houseDTO.getDoorNumber());
    }

    public HouseDTO house2houseDto(House house) {
        return new HouseDTO(house.getName(), house.getDoorNumber());
    }
}
