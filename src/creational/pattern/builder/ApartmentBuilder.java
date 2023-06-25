package creational.pattern.builder;

public class ApartmentBuilder {
    // same parameters for Apartment with default values
    private int area = -1;
    private int numberOfRooms = -1;
    private String city = "";
    private String state = "";
    private boolean hasKitchen = false;

    public ApartmentBuilder() {}

    // Create setters, return Builder
    public ApartmentBuilder setArea(int area) {
        this.area = area;
        return this;
    }

    public ApartmentBuilder setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    public ApartmentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public ApartmentBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public ApartmentBuilder setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
        return this;
    }

    public Apartment build() {
        Apartment apartment = new Apartment(this.area, this.numberOfRooms, this.city, this.state, this.hasKitchen);
        // reset default values
        this.area = -1;
        this.numberOfRooms = -1;
        this.city = "";
        this.state = "";
        this.hasKitchen = false;
        return apartment;
    }
}
