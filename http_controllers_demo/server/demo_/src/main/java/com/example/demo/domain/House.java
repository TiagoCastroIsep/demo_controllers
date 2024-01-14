package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class House {
    private final String name;
    private final int doorNumber;
    List<String> rooms;
    public House(String name, int doorNumber) {
        this.name = name;
        this.doorNumber = doorNumber;
        this.rooms = new ArrayList<>();
    }

    public House getHouse(){
        return new House(name, doorNumber);
    }

    public String addRoom(String room) {
        rooms.add(room);

        return room;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", doorNumber=" + doorNumber +
                '}';
    }
}
