package ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Building {

    private String buldingName;
    ArrayList<Rooms> rooms = new ArrayList<Rooms>();

    Building(String buldingName) {
        this.buldingName = buldingName;
    }

    public void add(int roomIndex, Bulb bulb) throws IlluminanceLimitException {
        Rooms room = rooms.get(roomIndex - 1);
        room.add(bulb);
    }

    public void addRoom(String name, int square, int windows) throws IlluminanceLimitException {
        Rooms room = new Rooms(name, square, windows);
        rooms.add(room);
    }

    public void add(int roomIndex, Furniture furniture) throws SpaceLimitExeption {
        Furniture furniture1 = new Furniture(furniture.getFurnitureName(), furniture.square());
        Rooms room = rooms.get(roomIndex - 1);
        room.add(furniture);
    }

    public void information() {
        System.out.println("Building 'It Academy'");
        for (int i = 0; i < rooms.size(); i++) {
            int ill = 0;
            int square = 0;
            System.out.println("Room No. " + (i + 1));
            System.out.print("Illumination=");
            Rooms room = rooms.get(i);
            ArrayList<Bulb> bulbs;

            ArrayList<Bulb> bublelist = rooms.get(i).getBulbs();
            String bulbIntence = "";
            for (int j = 0; j < room.bulbs.size(); j++) {
                ill += room.bulbs.get(j).getIntensity();
                bulbIntence += room.bulbs.get(j).getIntensity() + " lk,";
            }
            String furnitureInfo = "";
            for (int m = 0; m < room.furnitures.size(); m++) {
                int furnitureSquare = room.furnitures.get(m).getSquare();
                square += furnitureSquare;
                if (square == 0) {
                    furnitureInfo = "There's no furniture in this room !";
                } else {
                    furnitureInfo += room.furnitures.get(m).getFurnitureName() + " with square " + furnitureSquare + " m2. ";
                }
            }
            ill += room.getWindows() * 700;
            System.out.println("Illumination in Room " + (i + 1) + " is " + ill + ". Windows quantity - " + room.getWindows() + ",  bulbs quantity -" + room.bulbs.size() + ": " + bulbIntence);
            System.out.println("Furnitures  in Room " + (i + 1) + " occupies " + square + " m2");
            System.out.println("Furnitures:");
            System.out.println(furnitureInfo);
        }
    }

}

