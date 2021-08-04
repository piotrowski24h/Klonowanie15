package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.strategy.builder.bigMac.Bigmac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMac() {
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                     .bun("roll")
                     .sauce("hot")
                     .burgers(2)
                     .ingredient("Salt")
                     .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(1, howManyIngredients);
    }


  @Test
void testBigMacBurgers() {
    //Given
      Bigmac bigmac = new Bigmac.BigmacBuilder()
              .burgers(5).build();
      System.out.println(bigmac + "meat");
      //When
      int howManyBurgers = bigmac.getBurgers();
      //Then
      assertEquals(5,howManyBurgers);
    }
}