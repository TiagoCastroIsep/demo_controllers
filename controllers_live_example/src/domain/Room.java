package domain;

public class Room {
    private String name;
    private int dim;
    public Room(String name, int dim) {
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
