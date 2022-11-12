package ua.edu.ucu.apps.flower_store_web.flower_store;

import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerSpec;

import java.util.List;

public interface SearchEngine {
    List<Flower> search(FlowerSpec searchSpec, List<Flower> inventory);

}
