package com.example.demo.controllers;

import com.example.demo.dto.HouseDTO;
import com.example.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class HouseController {
    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        System.out.println("Autowired Controller Constructor");
        this.houseService = houseService;
    }

    @GetMapping("/house")
    public List<HouseDTO> getHouses() {
        return houseService.getHouses();
    }

    @GetMapping("/house{id}")
    public HouseDTO getHouseById(@PathVariable("id") int indexHouse) {
        return houseService.getHouse(indexHouse);
    }

    @PostMapping("/house")
    public void addHouse(@RequestBody HouseDTO houseDTO) {
        System.out.println("Received a post request, here's the DTO: " + houseDTO);
        houseService.addHouse(houseDTO);
    }

    @PostMapping("/house?q={id}")
    public HouseDTO addRoom(@PathVariable("id") int indexHouse) {
        return houseService.getHouse(indexHouse);
    }
}
