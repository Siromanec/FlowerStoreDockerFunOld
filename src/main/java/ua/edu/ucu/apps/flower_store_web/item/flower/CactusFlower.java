package ua.edu.ucu.apps.flower_store_web.item.flower;

import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.Item;

public class CactusFlower extends Item {
    private Flower cactusFlower;
    public double price() {
        return cactusFlower.getPrice();
    };
}
