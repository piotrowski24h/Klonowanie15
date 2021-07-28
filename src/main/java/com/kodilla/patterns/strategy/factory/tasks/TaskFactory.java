package com.kodilla.patterns.strategy.factory.tasks;

public class TaskFactory {
    public final String DRIVING_TASK = "DRIVINGTASK";
    public final String PAINTING_TASK = "PAINTINGTASK";
    public final String SHOPPING_TASK = "SHOPINGTASK";


    public final Task buildTask(final String newTask) {
        switch (newTask) {
            case DRIVING_TASK:
                return new DrivingTask("Przyjazd", "Do magazynu", "IVECO");
            case PAINTING_TASK:
                return new PaintingTask("Malowanie ", "biały", "kuchnia");
            case SHOPPING_TASK:
                return new ShoppingTask("Spożywcze", "Wino", 10);
            default:
                throw new RuntimeException("This task doesn't exist");

        }


    }
}
