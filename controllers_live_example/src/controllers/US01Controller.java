package controllers;

import domain.House;
import domain.Room;
import dtos.RoomDTO;
import mappers.RoomMapper;

import java.util.ArrayList;
import java.util.List;

public class US01Controller {
    public void defineLocation(House house) {
        System.out.println(house);
    }

    public List<RoomDTO> getRoom(House house, RoomDTO roomDTO) {
        RoomMapper roomMapper = new RoomMapper();
        Room room = roomMapper.dtoToRoom(roomDTO);

        List<Room> result = house.getRoomList(room);

        List<RoomDTO> list = new ArrayList<>();
        for (Room room1 : result) {
            list.add(roomMapper.roomToDTO(room1));
        }

        return list;
    }

    RoomDTO
    {
        "name": "valor",
        "dim": 1
    }

    public RoomDTO addRoomToHouse(House house, RoomDTO roomDTO) {
        house.addRoom(name, dim);
    }
}
