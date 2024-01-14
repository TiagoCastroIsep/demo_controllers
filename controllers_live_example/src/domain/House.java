package domain;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String street;
    private String country;
    private List<Room> rooms;
    public House(String street, String country) {
        this.street = street;
        this.country = country;
        this.rooms = new ArrayList<>();
    }

    public boolean setLocation(String updatedStreet, String updatedCountry) {
        if(!isValid(updatedStreet, updatedCountry)) {
            return false;
        }

        street = updatedStreet;
        country = updatedCountry;

        return true;
    }

    private boolean isValid(String updatedStreet, String updatedCountry) {
        if (updatedStreet == null || updatedStreet.trim().isEmpty()) {
            return false;
        }
        if (updatedCountry == null || updatedCountry.trim().isEmpty()) {
            return false;
        }

        return true;
    }

    public List<Room> getRoomList(Room room) {
        rooms.add(room);
        rooms.add(room);
        return rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void addRoom(String name, int dim) {
        Room room = new Room(name, dim);
        rooms.add(room);
    }
}
