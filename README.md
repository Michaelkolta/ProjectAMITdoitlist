📌 DOIT LIST – Android Automation Framework
Appium | TestNG | Cucumber | POM | Android Studio | Appium Inspector | Allure

This repository contains a complete mobile automation testing framework for the DOIT LIST Android application.
The project is designed to help QA engineers—especially beginners—learn real Android automation using modern industry tools and best practices.

🎯 Project Purpose

The goal of this project is to provide a practical, scalable, and easy-to-understand automation framework that teaches:

How to automate real Android apps with Appium

How to structure tests using Page Object Model (POM)

How to run tests using TestNG

How to write BDD tests using Cucumber (Gherkin)

How to inspect elements using Appium Inspector

How to view professional test results using Allure Reports

This framework is ideal for beginners advancing toward mid-level mobile automation skills.

🧪 Automated Test Scenarios

This project covers five essential real-world mobile app test scenarios:

Scenario 1 — Add a New Task

Verify that the user can create a new task with title & description.

Scenario 2 — Edit an Existing Task

Ensure that task details can be updated successfully.

Scenario 3 — Delete a Task

Validate that the user can remove an existing task.

Scenario 4 — Mark a Task as Completed

Check that tasks can be marked as completed.

Scenario 5 — Filter Completed Tasks

Verify that the user can filter and view completed tasks only.

📂 Project Structure
DOIT-LIST-Automation/
│
├── src/main/java/
│   ├── Base/                 # Driver initialization & configuration
│
├── src/test/java/
│   ├── Tests/                # TestNG test classes
│
│── StepDefinitions/          # Cucumber step definitions
│
│   ├── Hooks/                # Cucumber hooks for setup/teardown
│
│   ├── LocalStepDef/         # Local step definitions (custom logic)
│
├── resources/
│   └── capabilities.json     # Appium desired capabilities
│
├── Features/                 # Cucumber BDD .feature files
│
└── README.md

🚀 Tech Stack
Technology	Description
Java	Primary programming language
Appium (UiAutomator2)	Android automation engine
TestNG	Testing & assertions
Cucumber (BDD)	Gherkin scenarios & step definitions
Page Object Model (POM)	Scalable reusable framework pattern
Android Studio	Emulator & debugging environment
Appium Inspector	Locator inspection and validation
Allure Reporting	Detailed & visual test results
▶️ Running the Tests
1️⃣ Install Requirements

Java JDK 17+

Android Studio + Emulator

Appium Server CLI or Appium Desktop

Appium Inspector

Maven

Node.js

2️⃣ Start Appium Server
appium

3️⃣ Launch Android Emulator

From Android Studio:

Tools → Device Manager → Start Emulator

4️⃣ Run TestNG Tests
mvn test

5️⃣ Run Cucumber Tests
mvn test -Dcucumber.filter.tags="@regression"

📊 Allure Reporting
Generate Allure Report:
allure generate allure-results --clean -o allure-report

Open Report:
allure open allure-report

🧩 Sample Cucumber Feature
Feature: Manage tasks in DOIT LIST

Scenario: Add a new task
Given the user is on the DOIT LIST home screen
When the user adds a task with title "Read Book" and description "15 pages"
Then the task should appear in the task list

✨ Framework Highlights

✔ Beginner-friendly
✔ Real Android App Automation
✔ Clean POM structure
✔ Supports both TestNG & Cucumber
✔ Allure Reports integrated
✔ Element inspection with Appium Inspector
✔ Production-style folder structure

🤝 Contributions

Contributions are welcome!
You can contribute by:

Adding more scenarios

Improving POM design

Enhancing Cucumber steps

Adding CI/CD pipeline

📄 License

This project is released under the MIT License.
