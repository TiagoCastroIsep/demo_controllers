import controllers.US01Controller;
import domain.House;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter new house street");
//        String street = scanner.nextLine();
//        System.out.println("Enter new house country");
//        String country = scanner.nextLine();
        US01Controller us01Controller = new US01Controller();
        House house1 = new House("s0", "pt");
        House house2 = new House("s1", "country");
        us01Controller.defineLocation(house1);
        us01Controller.defineLocation(house2);

        System.out.println(house1.getRoomList("r1"));
        System.out.println(house2.getRoomList("r2"));

    }
}