package ua.edu.ucu.apps.flower_store_web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.flower_store_web.item.Item;
import ua.edu.ucu.apps.flower_store_web.item.bucket.FlowerBucket;
import ua.edu.ucu.apps.flower_store_web.flower_store.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.flower_store.flowerpack.FlowerPack;
import ua.edu.ucu.apps.flower_store_web.flower_store.flowers.Rose;

import java.util.Random;

/**
 * tests for flowerbucket
 * @hidden
 */

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private Item item;

    /**
     * setup
     */
    @BeforeEach
    public void init() {
        item = new FlowerBucket();
    }

    /**
     * test price
     *
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        //FlowerBucket.addFlowers(flower);
        Assertions.assertEquals(price * quantity, item.price());
    }
}
