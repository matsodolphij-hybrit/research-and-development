package com.research.katas.cupcake;

import org.junit.jupiter.api.Test;

import com.katas.cupcake.Cookie;
import com.katas.cupcake.Cupcake;
import com.katas.cupcake.FoodBundle;
import com.katas.cupcake.toppings.ChocolateTopping;
import com.katas.cupcake.toppings.NutsTopping;
import com.katas.cupcake.toppings.SugarTopping;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupcakeBundleTest {

    @Test
    void createABundleWithOneCupcake() {
        FoodBundle foodBundle = new FoodBundle("Small bundle");
        foodBundle.addItem(new Cupcake());
        assertEquals("Small bundle: A plain cupcake", foodBundle.getName());
        assertEquals(1.0, foodBundle.getCost());
    }

    @Test
    void createABundleWithOneCupcakeAndOneCookie() {
        FoodBundle foodBundle = new FoodBundle("Crazy tuesday combo");
        foodBundle.addItem(new Cupcake());
        foodBundle.addItem(new Cookie());

        assertEquals("Crazy tuesday combo: A plain cupcake A cookie", foodBundle.getName());
        assertEquals(3.0, foodBundle.getCost());
    }

    @Test
    void createABundleWithTwoCupcakeAndOneCookie() {
        FoodBundle foodBundle = new FoodBundle("Crazy wednesday combo");
        foodBundle.addItem(new Cupcake());
        foodBundle.addItem(new Cupcake());
        foodBundle.addItem(new Cookie());

        assertEquals("Crazy wednesday combo: A plain cupcake A plain cupcake A cookie", foodBundle.getName());
        assertEquals(4.0, foodBundle.getCost());
    }

    @Test
    void createABundleWithACupcakeAndACookieWithAllToppings() {
        FoodBundle foodBundle = new FoodBundle("Crazy friday combo (TGIF)");
        foodBundle.addItem(new SugarTopping(new ChocolateTopping(new NutsTopping(new Cupcake()))));
        foodBundle.addItem(new SugarTopping(new ChocolateTopping(new NutsTopping(new Cookie()))));

        assertEquals("Crazy friday combo (TGIF): A plain cupcake with nuts with Chocolate with sugar A cookie with nuts with Chocolate with sugar", foodBundle.getName());
        assertEquals(4.6000000000000005, foodBundle.getCost()); // TODO: not sure where this went wrong, should investigate further
    }
}
