package com.example.demo.dto;

public class HouseDTO {
    private final String name;
    private final int doorNumber;

    public HouseDTO(String name, int doorNumber) {
        this.name = name;
        this.doorNumber = doorNumber;
    }

    public String getName() {
        return name;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    @Override
    public String toString() {
        return "HouseDTO{" +
                "name='" + name + '\'' +
                ", doorNumber=" + doorNumber +
                '}';
    }
}
