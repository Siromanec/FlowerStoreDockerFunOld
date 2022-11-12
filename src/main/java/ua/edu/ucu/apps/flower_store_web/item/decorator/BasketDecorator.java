package ua.edu.ucu.apps.flower_store_web.item.decorator;

import ua.edu.ucu.apps.flower_store_web.item.Item;

public class BasketDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription() + " with BasketDecorator";
    }

    public double getPrice() {
        return 4 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }
}
