package ua.edu.ucu.apps.flower_store_web.flower_store.flower;

import lombok.Getter;
import lombok.Setter;

/**
 * Flowers. We sell them
 */

public class Flower {
    @Getter
    private final FlowerSpec spec = new FlowerSpec();
    @Getter @Setter
    private double price;
    @Getter @Setter

    private FlowerType flowerType;

    /**
     * constructor
     */
    public Flower() { }

    /**
     * constructor with parameters
     * @param price price
     * @param color color
     * @param sepalLength sepalLength
     */
    public Flower(double price,
                  FlowerColor color,
                  double sepalLength) {

        setPrice(price);
        spec.setColor(color);
        spec.setSepalLength(sepalLength);
    }



    @Override
    public String toString() {
        return "Flower{" +
                "color='" + getSpec().getColor()+ "'" +
                ", sepalLength=" + getSpec().getSepalLength() +
                ", price=" + getPrice() +
                "}";
    }


}
