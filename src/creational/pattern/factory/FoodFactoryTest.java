package creational.pattern.factory;

public class FoodFactoryTest {

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Shape roundFood = foodFactory.getFood("Round");
        Shape cylinderFood = foodFactory.getFood("Cylinder");

        System.out.println("Round".equals(roundFood.getShape()));
        System.out.println("Cylinder".equals(cylinderFood.getShape()));
    }
}
