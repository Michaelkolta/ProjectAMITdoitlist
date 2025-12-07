package Tests;

import Base.BaseTest;

public class UnderContinuousTask extends BaseTest {


    public void addTasksUnderLoad() throws Exception {

        long startTime = System.currentTimeMillis();  // Start timer

        for (int i = 1; i <= 50; i++) {
            System.out.println("Adding task: " + i);

            // Example:
            // ClickAddButton();
            // EnterTaskTitle("Task " + i);
            // EnterTaskDescription("Description " + i);
            // ClickSaveButton();

            // Simulate delay
            Thread.sleep(300);
        }

        long endTime = System.currentTimeMillis();  // End timer
        long totalTime = (endTime - startTime) / 1000;

        System.out.println("🚀 Completed adding 50 tasks in: " + totalTime + " seconds");
    }


}
