package ArrayLists;

public class Furniture {

    private String furnitureName;
    private int square;

    public Furniture(String furnitureName, int square) {
        this.furnitureName = furnitureName;
        this.square = square;
    }

    public int square() {
        return square;
    }

    public String getFurnitureName() {
        return furnitureName;
    }

    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getSquare() {
        return square;

    }
}
