package ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Rooms {

    private String name;
    private int square;
    private int windows;
    ArrayList<Bulb> bulbs = new ArrayList<Bulb>();
    ArrayList<Furniture> furnitures = new ArrayList<Furniture>();

    public Rooms(String name, int square, int windows) {
        this.name = name;
        this.square = square;
        this.windows = windows;
    }

    public void add(Bulb bulb) throws IlluminanceLimitException {
        bulbs.add(bulb);
        IlluminationCheck();
    }

    public void add(Furniture furniture) throws SpaceLimitExeption {
        furnitures.add(furniture);
        SpaceCheck();
    }

    public void IlluminationCheck() throws IlluminanceLimitException {
        int intenseSum = 0;
        for (Bulb bulbs : bulbs) {
            intenseSum += bulbs.getIntensity();
        }
        intenseSum = intenseSum + windows * 700;
        if (intenseSum > 4000)
            throw new IlluminanceLimitException("The illumination level reached!");
    }

    public void SpaceCheck() throws SpaceLimitExeption {
        int space = 0;
        for (Furniture mebel : furnitures) {
            space += mebel.getSquare();
        }
        if (space > square * 0.7) throw new SpaceLimitExeption("The space limit exceeded!");
    }

    public String getName() {
        return name;
    }

    public int getWindows() {
        return windows;
    }

    public int getSquare() {
        return square;
    }

    public ArrayList<Bulb> getBulbs() {
        return bulbs;
    }
}
