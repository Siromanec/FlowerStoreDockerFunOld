package ua.edu.ucu.apps.flower_store_web.flower_store;

import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerSpec;
import ua.edu.ucu.apps.flower_store_web.flower_store.flowerpack.FlowerPack;

import java.util.ArrayList;
import java.util.List;

public class FlowerSearchEngine implements SearchEngine{
    public List<Flower> search(FlowerSpec searchSpec, List<Flower> inventory) {

        List<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower : inventory) {
            FlowerSpec flowerSpec = flower.getSpec();
            if (searchSpec.getColor() != flowerSpec.getColor()) {
                continue;
            }
            if (searchSpec.getSepalLength() != flowerSpec.getSepalLength()) {
                continue;
            }
            matchingFlowers.add(flower);
        }
        return matchingFlowers;
    }

}
