package ua.edu.ucu.apps.flower_store_web.flower_store.flowers;

import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerColor;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerType;

/**
 * the rose flower
 */
public class Rose extends Flower {
    /**
     * creates a red rose
     */
    public Rose() {
        super();
        getSpec().setColor(FlowerColor.RED);
        setFlowerType(FlowerType.ROSE);
    }
}
