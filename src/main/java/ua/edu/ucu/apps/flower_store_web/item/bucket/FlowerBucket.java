
package ua.edu.ucu.apps.flower_store_web.item.bucket;

import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.FlowerSpec;
import ua.edu.ucu.apps.flower_store_web.flower_store.flowerpack.FlowerPack;
import ua.edu.ucu.apps.flower_store_web.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * bucket
 * */

public class FlowerBucket extends Item {

    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    /**
     * constructor
     */
    public FlowerBucket() { }

    /**
     * adds flowerpacks to bucket
     * @param fp flower pack
     */
    public void addFlowers(Flower fp) {
        FlowerPack flowerPack = searchFlower(fp.getSpec());
        if (flowerPack!=null) {
            flowerPack.addFlower();
        }
        else {
            flowerPacks.add(new FlowerPack(fp, 1));
        }
        //flowerPacks.add(fp);
    }
    public FlowerPack searchFlower(FlowerSpec searchSpec) {

        return flowerPacks.stream()
                .filter(flowerPack ->
                        ((flowerPack.getFlower().getSpec().getColor()
                                ==searchSpec.getColor()))
                                &&
                        (flowerPack.getFlower().getSpec().getSepalLength()
                                ==searchSpec.getSepalLength()))
                .toList().get(0);
//          !(new FlowerSearchEngine()
//                .search(searchSpec,
//                        flowerPacks
//                                .stream()
//                                .map(FlowerPack::getFlower)
//                                .collect(Collectors.toList()))
//                 .isEmpty());

    }

    @Override
    public double price() {
        return flowerPacks
                .stream()
                .mapToDouble(FlowerPack::getPrice)
                .reduce(0.0,Double::sum);
    }

    /**
     *
     * @return string representation of flower bucket
     */
    @Override
    public String toString() {
        return flowerPacks.stream().toString();
    }
}
