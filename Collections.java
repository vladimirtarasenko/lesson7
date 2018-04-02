package ArrayLists;

public class Collections {

    public static void main(String[] args) {


        Building ITAcademy = new Building("IT academy");

        try {
            ITAcademy.addRoom("57", 70, 5);
            ITAcademy.addRoom("58", 40, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ITAcademy.add(1, new Bulb(100));
            ITAcademy.add(1, new Bulb(100));
            ITAcademy.add(2, new Bulb(100));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ITAcademy.add(1, new Furniture("Drawing table", 5));
            ITAcademy.add(1, new Furniture("Cozy chair", 1));
            ITAcademy.add(1, new Furniture("Wide sofa", 10));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ITAcademy.information();

    }

}


