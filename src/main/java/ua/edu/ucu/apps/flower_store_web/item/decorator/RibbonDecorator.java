package ua.edu.ucu.apps.flower_store_web.item.decorator;

import ua.edu.ucu.apps.flower_store_web.item.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription() + " with RibbonDecorator";
    }


    public double getPrice() {
        return 40 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }
}
