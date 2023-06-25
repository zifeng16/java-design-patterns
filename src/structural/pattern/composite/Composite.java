package structural.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Equipment {
    private List<Equipment> equipmentList = new ArrayList<>();

    public Composite(String name) {
        super(name, 0);
    }

    public Composite add(Equipment equipment) {
        equipmentList.add(equipment);
        return this;
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Equipment equipment : equipmentList) {
            sum += equipment.getPrice();
        }
        return sum;
    }
}
