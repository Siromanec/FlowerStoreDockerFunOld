package ua.edu.ucu.apps.flower_store_web.order.strategy.delivery;

import ua.edu.ucu.apps.flower_store_web.item.Item;

import java.util.List;

public interface Delivery {
     void deliver(List<Item> items);
     double fees(List<Item> items);
}
