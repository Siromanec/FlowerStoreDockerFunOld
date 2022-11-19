package ua.edu.ucu.apps.flower_store_web.item.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flower_store_web.item.Item;
import ua.edu.ucu.apps.flower_store_web.item.flowers.RoseFlower;

import java.util.Random;

class RibbonDecoratorTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private double price;


    private Item item;

    @BeforeEach
    void setUp() {
        price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        item = new RoseFlower(price);

    }
    @Test
    void getDescription() {
        Assertions.assertEquals("Rose{color='red', sepalLength=4.0, price="+price+"}",
                item.getDescription());
        item = new RibbonDecorator(item);
        Assertions.assertEquals("Rose{color='red', sepalLength=4.0, price="+price+"}"
                                       + " with RibbonDecorator{decoratorCost="+RibbonDecorator.getDECORATOR_COST()+"}",
                                         item.getDescription());


    }

    @Test
    void price() {
        Assertions.assertEquals(price, item.price());

        item = new RibbonDecorator(item);
        Assertions.assertEquals(price+40, item.price());
    }
}