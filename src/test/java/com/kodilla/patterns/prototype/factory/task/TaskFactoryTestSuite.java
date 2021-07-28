package com.kodilla.patterns.prototype.factory.task;

import com.kodilla.patterns.strategy.factory.tasks.DrivingTask;
import com.kodilla.patterns.strategy.factory.tasks.Task;
import com.kodilla.patterns.strategy.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void assertThatTaskFactoryCreatesCorrectTask() {
        TaskFactory taskFactory = new TaskFactory();

        String taskName = taskFactory.buildTask(taskFactory.DRIVING_TASK).getTaskName();

        Assertions.assertEquals("Przyjazd", taskName);
        // zadanie malarskie
//        String paintingTask =...


        // zadanie zakupowe
//        String shoppingTask =...

    }

    @Test
    void assertThatTaskWasNotExecuted() {
        TaskFactory taskFactory = new TaskFactory();

        Task task = taskFactory.buildTask(taskFactory.DRIVING_TASK);
        Assertions.assertFalse(task.isTaskExecuted());
        // zadania zakupowego
        // zadanie malarskie


    }
    @Test
    void assertThatTaskIsExecutedCorrectly() {
        TaskFactory taskFactory = new TaskFactory();

        Task task = taskFactory.buildTask(taskFactory.DRIVING_TASK);
        task.executeTask();
        Assertions.assertTrue(task.isTaskExecuted());

        // zadania zakupowego
        // zadanie malarskie

    }

}
