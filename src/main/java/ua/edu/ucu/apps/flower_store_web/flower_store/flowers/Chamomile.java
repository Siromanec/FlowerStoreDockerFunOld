package ua.edu.ucu.apps.flower_store_web.flower_store.flowers;


import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerColor;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerType;

/**
 * the chamomile
 */
public class Chamomile extends Flower {
    /**
     * creates a white chamomile
     */
    public Chamomile() {
        super();
        getSpec().setColor(FlowerColor.WHITE);
        setFlowerType(FlowerType.CHAMOMILE);
    }
}
