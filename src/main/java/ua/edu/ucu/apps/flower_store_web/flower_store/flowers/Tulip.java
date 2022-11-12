package ua.edu.ucu.apps.flower_store_web.flower_store.flowers;


import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerColor;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerType;

/**
 * A red pretty tulip
 */
public class Tulip extends Flower {
    /**
     *  creates a beautiful tulip
     */
    public Tulip() {
        super();
        getSpec().setColor(FlowerColor.RED);
        setFlowerType(FlowerType.TULIP);
    }
}
