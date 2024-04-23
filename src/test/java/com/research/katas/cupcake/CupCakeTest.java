package com.research.katas.cupcake;

import org.junit.jupiter.api.Test;

import com.katas.cupcake.Cookie;
import com.katas.cupcake.Cupcake;
import com.katas.cupcake.toppings.ChocolateTopping;
import com.katas.cupcake.toppings.NutsTopping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupCakeTest {

    @Test
    void oneCupcakeWithoutToppings() {
        assertEquals("A plain cupcake", new Cupcake().getName());
        assertEquals(1.0, new Cupcake().getCost());
    }

    @Test
    void oneCookieWithoutToppings() {
        assertEquals("A cookie", new Cookie().getName());
        assertEquals(2.0, new Cookie().getCost());
    }

    @Test
    void oneCupcakeWithChocolateTopping() {
        assertEquals("A plain cupcake with Chocolate", new ChocolateTopping(new Cupcake()).getName());
        assertEquals(1.1, new ChocolateTopping(new Cupcake()).getCost());
    }

    @Test
    void oneCookieWithChocolateTopping() {
        assertEquals("A cookie with Chocolate", new ChocolateTopping(new Cookie()).getName());
        assertEquals(2.1, new ChocolateTopping(new Cookie()).getCost());
    }

    @Test
    void oneCookieWithNutsTopping() {
        assertEquals("A cookie with nuts", new NutsTopping(new Cookie()).getName());
        assertEquals(2.2, new NutsTopping(new Cookie()).getCost());
    }
}
