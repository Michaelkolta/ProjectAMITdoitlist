package StepDef;

import Tests.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocalStepDef {

AddNewTask addNewTask;
EditExistingTask editExistingTask;
AutomateFilteringCompletedTasks automateFilteringCompletedTasks;
DeleteTask deleteTask;
MarkTaskComplete markTaskComplete;
ScreenRotationTask screenRotationTask;


@When("user add new Task")
    public void user_add_new_Task() throws InterruptedException {
    addNewTask = new AddNewTask();
    addNewTask.AddNewTaskTest();

}

@And("Add user Title Field")
    public void Add_user_Title_Field() throws InterruptedException {
    addNewTask.EnterTitle();

}

@And("Add user Description Field")
    public void Add_user_Description_Field() throws InterruptedException {
    addNewTask.EnterDescription();
}

@Then("Save Button")
    public void Save_Button() throws InterruptedException {
    addNewTask.ClickSave();
}

@And("User Select the Task")
    public void User_Select_the_Task() throws InterruptedException{
    editExistingTask = new EditExistingTask();
    editExistingTask.SelectAddaNewTask();
}
@And("User Click edit Task Button")
    public void User_Click_edit_Task_Button () throws InterruptedException {
    editExistingTask.EditTaskbutton();
}
@And("User Select Title to update")
    public void User_Select_Title_to_update() throws InterruptedException {
    editExistingTask.UpdateTexttitle();
}
@And("User Select Description to update")
    public void User_Select_Description_to_update() throws InterruptedException {
        editExistingTask.UpdateDescription();
}

@Then("User Click on the Save Button")
public void User_Click_on_the_Save_Button(){
editExistingTask.Savebutton();
}

@And("User Select the Task of edit")
    public void User_Select_the_Task_of_edit() throws InterruptedException {
    deleteTask=new DeleteTask();
    deleteTask.SelectTask();
}

@And("User Mark the checkbox")
    public void User_Mark_the_checkbox(){
    deleteTask.Checkbox();
}

@Then("Delete the Task by Click on the Recycle button")
    public void Delete_the_Task_by_Click_on_the_Recycle_button(){
    deleteTask.RecycleButton();
}

@And("Add user Title Field 2")
    public void Add_user_Title_Field_2() throws InterruptedException {
    addNewTask.EnterTitle2();
}
@And("Add user Description Field 2")
        public void Add_user_Description_Field_2() throws InterruptedException {
    addNewTask.EnterDescription2();

        }
@Then("Check the complete on checkbox")

    public void Check_the_complete_on_checkbox(){
    markTaskComplete=new MarkTaskComplete();
    markTaskComplete.Markcompletecheckbox();
}

@And("User Click on the widget Button dropdown")
    public void User_Click_on_the_widget_Button_dropdown() throws InterruptedException {
    automateFilteringCompletedTasks=new AutomateFilteringCompletedTasks();
    automateFilteringCompletedTasks.WidgetButton();

}
@Then("User click on completed Task")
    public void User_click_on_completed_Task(){
    automateFilteringCompletedTasks.CompleteButton();
}

@And("User Rotate from PORTRAIT to LANDSCAPE")
    public void User_Rotate_from_PORTRAIT_to_LANDSCAPE() throws InterruptedException {
    screenRotationTask= new ScreenRotationTask();
    screenRotationTask.RotateLandscape();
}

@Then("User Rotate again from LANDSCAPE to PORTRAIT")
    public void User_Rotate_again_from_LANDSCAPE_to_PORTRAIT() throws InterruptedException {
    screenRotationTask.RotatePortrait();
}



}
