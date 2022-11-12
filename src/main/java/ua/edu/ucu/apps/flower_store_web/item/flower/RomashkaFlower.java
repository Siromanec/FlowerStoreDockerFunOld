package ua.edu.ucu.apps.flower_store_web.item.flower;

import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flowers.Chamomile;
import ua.edu.ucu.apps.flower_store_web.item.Item;

public class RomashkaFlower extends Item {
    Chamomile romashkaFlower;
    @Override
    public double price() {
        return romashkaFlower.getPrice();
    }
}
