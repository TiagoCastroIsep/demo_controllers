package dtos;

public class RoomDTO {
    private String name;
    private int dim;

    public RoomDTO(String name, int dim) {
        this.name = name;
        this.dim = dim;
    }

    public String getName() {
        return name;
    }

    public int getDim() {
        return dim;
    }
}
