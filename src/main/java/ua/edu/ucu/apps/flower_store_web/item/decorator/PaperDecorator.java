package ua.edu.ucu.apps.flower_store_web.item.decorator;

import ua.edu.ucu.apps.flower_store_web.item.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription() + " with PaperDecorator";
    }

    public double getPrice() {
        return 13 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }
}
