package com.designpatterns.decorator;

/**
 *
 * ---- Inheritance is static and composition is dynamic ----
 * Arrow with diamond at the end instead of an arrow (UML) = Has a relationship with (aggregation relationship)
 *  - Aggregation implies a relationship where the child can exist independently of the parent (in other words not part of inheritance structure.)
 *
 *  What is the decorator pattern?
 *  1. The decorator allows you to modify an object dynamically
 *  2. You would use it when you want the capabilities of inheritance with subclasses, but you need to add functionality at run time.
 *  3. it is more flexible than inheritance
 *  4. Simplifies code because you add functionality using many simple classes
 *  5. Rather than rewrite old code you can extend new code.
 *
 * It is a structural design pattern
 */
public class ToppingDecorator implements Pizza {

    protected Pizza plainPizza;

    public ToppingDecorator(final Pizza pizza) {
        plainPizza = pizza;
    }

    @Override
    public String getDescription() {
        return plainPizza.getDescription();
    }

    @Override
    public double getCost() {
        return plainPizza.getCost();
    }
}
