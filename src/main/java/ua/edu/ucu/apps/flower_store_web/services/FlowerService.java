package ua.edu.ucu.apps.flower_store_web.services;

import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerColor;

import java.util.List;

@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        return List.of(
                new Flower(10,
                        FlowerColor.RED,
                        0.5),
                new Flower(30,
                        FlowerColor.BLUE,
                        2),
                new Flower(100,
                        FlowerColor.WHITE,
                        10));
    }
}
