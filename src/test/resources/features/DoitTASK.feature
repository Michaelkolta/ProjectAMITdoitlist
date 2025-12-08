Feature:  Add a New Task

    #Scenario 1: Verify That User Can Add a New Task
  @AddNewTask
  Scenario:  User Can Add a New Task
    When user add new Task
    And Add user Title Field
    And Add user Description Field
    Then Save Button

    #Scenario 2: Verify That User Can Edit an Existing Task

  @EditaExistingTask

  Scenario: User Can Edit an Existing Task

    When User Select the Task
    And User Click edit Task Button
    And User Select Title to update
    And User Select Description to update
    Then User Click on the Save Button

  #Scenario 3: Verify That User Can Delete a Task

  @DeleteTask
    Scenario: User Can Delete a Task
    When User Select the Task of edit
    And User Mark the checkbox
    Then Delete the Task by Click on the Recycle button

  #Scenario 4: Verify That User Can Mark a Task as Complete

  @MarkTaskcomplete
  Scenario: User Can Mark a Task as Complete
    When user add new Task
    And Add user Title Field
    And Add user Description Field
    Then Save Button
    When  user add new Task
    And Add user Title Field 2
    And Add user Description Field 2
    And Save Button
    Then Check the complete on checkbox

    #Scenario 5: Automate Filtering Completed Tasks
  @FilteringCompletedTask
  Scenario: Filtering Completed Tasks
    When User Click on the widget Button dropdown
    Then User click on completed Task

  #Scenario 6: Verify App Behavior After Screen Rotation
  @ScreenRotation
  Scenario: Screen Rotation Behavior
  When user add new Task
  And Add user Title Field
  And Add user Description Field
  And Save Button
  And User Rotate from PORTRAIT to LANDSCAPE
  Then User Rotate again from LANDSCAPE to PORTRAIT

  #Scenario 7: Verify App Performance Under Continuous Task Creation
  @UnderLoadTask
  Scenario: App Performance UnderLoad Task
    When user add new Task
    And Add user Title Field
    And Add user Description Field
    And Save Button
    Then User a loop to add 50 plus tasks

  # Scenario 8: Validate Offline Functionality (if supported)
  @OfflineFunctionality
  Scenario: Offline Functionality support
    When User Turnoff the Network
    And user add new Task
    And Add user Title Field
    And Add user Description Field
    And Save Button
    Then User TurnOn the Network


