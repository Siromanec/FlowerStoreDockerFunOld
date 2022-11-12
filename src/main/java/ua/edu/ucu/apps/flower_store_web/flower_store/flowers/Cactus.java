package ua.edu.ucu.apps.flower_store_web.flower_store.flowers;

import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerColor;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerType;

public class Cactus extends Flower {
    public Cactus() {
        super();
        getSpec().setColor(FlowerColor.PINK);
        setFlowerType(FlowerType.ROSE);
    }
}
