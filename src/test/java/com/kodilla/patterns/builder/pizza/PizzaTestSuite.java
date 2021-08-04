package com.kodilla.patterns.builder.pizza;

import com.kodilla.patterns.strategy.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTestSuite {

     @Test
    void testPizzaNew() {
         // Given
         Pizza pizza = new Pizza("Thin", "Spicy", "Mushrooms", "Onion", "Ham");
         System.out.println(pizza);
         // When
         int howManyIngredients = pizza.getIngredients().size();
         //Then
         assertEquals(3,howManyIngredients);
     }

}
