package mappers;

import domain.Room;
import dtos.RoomDTO;

public class RoomMapper {
    public Room dtoToRoom(RoomDTO roomDTO) {
        return new Room(roomDTO.getName(), roomDTO.getDim());
    }

    public RoomDTO roomToDTO(Room room) {
        return new RoomDTO(room.getName(), room.getDim());
    }
}
