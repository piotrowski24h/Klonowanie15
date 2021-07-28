package com.kodilla.patterns.prototype.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {


    @Test
    void testDefaultSharingStrategies() {

        //Given
        User tom = new Millenials("Tom Jons");
        User dan = new ZGeneration("Daniel");
        User ola = new YGeneration("Ola Kot");
        //When
        String tomPost = tom.sharePost();
        System.out.println(tomPost);

        String danPost = dan.sharePost();
        System.out.println(danPost);

        String olaPost = ola.sharePost();
        System.out.println(olaPost);

        //Then
        Assertions.assertEquals(tom,"Snapchat");
        Assertions.assertEquals(tomPost, "Snapchat");

        Assertions.assertEquals(dan, "Snapchat");
        Assertions.assertEquals(danPost, "Snapchat");

        Assertions.assertEquals(ola, "Snapchat");
        Assertions.assertEquals(olaPost,"Smapchat");
    }

    @Test
    void testIndividualSharingStrategyTom() {
        //Givem
        User tom = new Millenials("Tom Jons");
        tom.setSocialPublisher(new FacebookPublisher());


        //When
        String tomPost = tom.sharePost();

        //Then
        Assertions.assertEquals(tomPost, "Facebook");


    }

    @Test
    void testIndividualSharingStrategyDan() {

        //Given
        User dan = new ZGeneration("Daniel");
        dan.setSocialPublisher(new FacebookPublisher());

        //when
        String danPost = dan.sharePost();

        //Then
        Assertions.assertEquals(danPost, "Facebook");
    }

    @Test
    void testIndividualSharingStrategyOla() {

        //Given
        User ola =new YGeneration("Ola Kot");
        ola.setSocialPublisher(new FacebookPublisher());

        //When
        String olaPost = ola.sharePost();

        //Then
        Assertions.assertEquals(olaPost,"Facebook");
    }
}