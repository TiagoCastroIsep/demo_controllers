package com.example.demo.repo;

import com.example.demo.domain.House;

import java.util.ArrayList;
import java.util.List;

public class HouseList {
    static List<House> houses = new ArrayList<>();

    public static void setHouses(House house) {
        houses.add(house);
    }

    public static List<House> getHouses() {
        return houses;
    }

    public static House getHouseByIndex(int indexHouse) {
        return houses.get(indexHouse);
    }
}
