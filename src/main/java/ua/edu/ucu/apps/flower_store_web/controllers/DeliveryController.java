package ua.edu.ucu.apps.flower_store_web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;

import java.util.List;

public class DeliveryController {
    private final DeliveryController deliveryController;

    @Autowired
    public DeliveryController(DeliveryController deliveryController) {
        this.deliveryController = deliveryController;
    }

    @GetMapping //rest endpoint
    public List<Flower> getFlowers() {
        return deliveryController.getFlowers();
    }
}
