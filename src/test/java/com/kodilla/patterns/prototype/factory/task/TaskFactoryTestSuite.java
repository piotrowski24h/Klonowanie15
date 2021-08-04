package com.kodilla.patterns.prototype.factory.task;

import com.kodilla.patterns.strategy.factory.tasks.DrivingTask;
import com.kodilla.patterns.strategy.factory.tasks.Task;
import com.kodilla.patterns.strategy.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void assertThatTaskFactoryCreatesCorrectTaskDriving() {
        // Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        String taskName = taskFactory.buildTask(taskFactory.DRIVING_TASK).getTaskName();
        //
        Assertions.assertEquals("Przyjazd", taskName);


    }
    @Test
    void assertThatTaskFactoryCreatesCorrectTaskPaint() {
            // Given
        TaskFactory taskFactory = new TaskFactory();
        // When
        String taskName = taskFactory.buildTask(taskFactory.PAINTING_TASK).getTaskName();
        // Then
        Assertions.assertEquals("Malowanie",taskName);

    }
  @Test
  void assertThatTaskFactoryCreatesCorrectTaskShoping() {
        // Given
      TaskFactory taskFactory = new TaskFactory();
      // When
      String taskName = taskFactory.buildTask(taskFactory.SHOPPING_TASK).getTaskName();
      // Then
      Assertions.assertEquals("Spożywcze",taskName);
  }

    @Test
    void assertThatTaskWasNotExecutedDriving() {
        TaskFactory taskFactory = new TaskFactory();

        Task task = taskFactory.buildTask(taskFactory.DRIVING_TASK);
        Assertions.assertFalse(task.isTaskExecuted());
    }
        @Test
        void assertThatTaskWasNotExecutedPaint() {
            TaskFactory taskFactory = new TaskFactory();
           Task task = taskFactory.buildTask(taskFactory.PAINTING_TASK);
            Assertions.assertFalse(task.isTaskExecuted());

        }

        @Test
        void assertThatTaskWasNotExecutedShop() {
         TaskFactory taskFactory = new TaskFactory();
         Task task = taskFactory.buildTask(taskFactory.SHOPPING_TASK);
        Assertions.assertFalse(task.isTaskExecuted());
    }



    @Test
    void assertThatTaskIsExecutedCorrectlyDriving() {
        TaskFactory taskFactory = new TaskFactory();

        Task task = taskFactory.buildTask(taskFactory.DRIVING_TASK);
        task.executeTask();
        Assertions.assertTrue(task.isTaskExecuted());


    }
    @Test
    void assertThatIsExecutedCorrectlyPainting() {
        TaskFactory taskFactory =new TaskFactory();

        Task task = taskFactory.buildTask(taskFactory.PAINTING_TASK);
        task.executeTask();
        Assertions.assertTrue(task.isTaskExecuted());

    }

    @Test
    void assertThatIsExecutedCorrectlyShoping()  {
        TaskFactory taskFactory = new TaskFactory();

        Task task = taskFactory.buildTask((taskFactory.SHOPPING_TASK));
        task.executeTask();
        Assertions.assertTrue(task.isTaskExecuted());
    }

}
