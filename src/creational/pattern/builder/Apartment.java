package creational.pattern.builder;

public class Apartment {
    private int area;
    private int numberOfRooms;
    private String city;
    private String state;
    private boolean hasKitchen;

    public Apartment(int area, int numberOfRooms, String city, String state, boolean hasKitchen) {
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.city = city;
        this.state = state;
        this.hasKitchen = hasKitchen;
    }

    // Setters are moved to builder

    // Getters
    public int getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isHasKitchen() {
        return hasKitchen;
    }

    public void showApartment() {
        System.out.println("");
        System.out.println("Apartment has:");
        if (area != -1) {
            System.out.println(area + " m^2");
        }
        if (numberOfRooms != -1) {
            System.out.println(numberOfRooms + " rooms");
        }
        if (!city.equals("")) {
            System.out.println("Apartment is in " + city);
        }
        if (!state.equals("")) {
            System.out.println("Apartment is in " + state);
        }
        if (hasKitchen) {
            System.out.println("Apartment has a kitchen");
        }
        System.out.println("");
    }
}
