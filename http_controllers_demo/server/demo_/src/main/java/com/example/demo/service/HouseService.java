package com.example.demo.service;

import com.example.demo.domain.House;
import com.example.demo.dto.HouseDTO;
import com.example.demo.repo.HouseList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {
    public HouseService() {
        System.out.println("Constructed Service");
    }

    public HouseDTO getHouse(int indexHouse) {
        House house = HouseList.getHouseByIndex(indexHouse);
        return new HouseDTO(house.getName(), house.getDoorNumber());
    }

    public HouseDTO addHouse(HouseDTO houseDTO) {
        House house = new House(houseDTO.getName(), houseDTO.getDoorNumber());
        HouseList.setHouses(house);

        System.out.println("Added to the house list: " + houseDTO);

        return new HouseDTO(houseDTO.getName(), houseDTO.getDoorNumber());
    }

    public List<HouseDTO> getHouses() {
        List<House> houseList = HouseList.getHouses();
        List<HouseDTO> houseDTOlist = new ArrayList<>();
        for (House house : houseList) {
            HouseDTO houseDTO1 = new HouseDTO(house.getName(), house.getDoorNumber());
            houseDTOlist.add(houseDTO1);
        }

        return houseDTOlist;
    }
}
