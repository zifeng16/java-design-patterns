package creational.pattern.builder;

public class Client {
    public static void main(String[] args) {
        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();

        Apartment apartment1 = apartmentBuilder
              .setArea(120)
              .setNumberOfRooms(4)
              .setCity("Guangzhou")
              .setState("GuangDong")
              .setHasKitchen(true)
              .build();

        apartment1.showApartment();

        Apartment apartment2 = apartmentBuilder
              .setArea(300)
              .setNumberOfRooms(6)
              .setCity("Chongqing")
              .setState("Chongqing")
              .setHasKitchen(false)
              .build();

        apartment2.showApartment();
    }
}
