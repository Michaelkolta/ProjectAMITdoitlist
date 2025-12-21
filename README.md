

## 📖 Overview
This repository contains a **full Android automation framework** for the **DoItList app**.  
It uses **Appium**, **TestNG**, **Cucumber**, and **Page Object Model (POM)** for robust, maintainable, and scalable automation.

---

## 🛠 Tools & Technologies
- **IDE:** Android Studio
- **Language:** Java 11+
- **Automation:** Appium & Appium Inspector
- **Testing:** TestNG, Cucumber BDD
- **Architecture:** Page Object Model (POM)
- **Reporting:** Allure
- **Build Tool:** Maven / Gradle

---

## ✅ Test Scenarios

| # | Scenario                 | Description                                          |
|---|--------------------------|------------------------------------------------------|
| 1 | Add a New Task           | Verify that the user can add a new task successfully |
| 2 | Edit an Existing Task    | Verify that the user can edit a task's details       |
| 3 | Delete a Task            | Verify that the user can delete an existing task     |
| 4 | Mark Task Complete       | Verify that the user can mark a task as completed    |
| 5 | Filter Completed Tasks   | Verify filtering of completed tasks                  |
| 6 | Screen Rotation          | Verify app behavior on device rotation               |
| 7 | Continuous Task Creation | Verify app performance under bulk task creation      |
| 8 | Offline Functionality    | Verify app behavior offline (if supported)           |

---

## 🏗 Framework Structure

DoItList-Automation/
│
├── src/
│ ├── main/java/com/doitlist/pages/ # Page Object classes
│ └── test/
│ ├── java/com/doitlist/stepdefinitions/ # Cucumber step defs
│ ├── java/com/doitlist/tests/ # TestNG test classes
│ └── resources/features/ # Cucumber feature files
│
├── pom.xml / build.gradle # Project build file
├── testng.xml # TestNG suite
├── allure-results/ # Allure report results
└── README.md # Project documentation

📊 Reporting

Allure Reports

allure serve allure-results


Features:

Pass/Fail status

Step-wise Cucumber scenario details

Screenshots for failures
