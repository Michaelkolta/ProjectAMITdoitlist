# 📌 DOIT LIST – Android Automation Framework
### *Appium | TestNG | Cucumber | POM | Android Studio | Appium Inspector | Allure*

This repository contains a complete **mobile automation testing framework** for the **DOIT LIST** Android application.  
The project is designed to help **QA engineers—especially beginners—learn real Android automation** using modern industry tools and best practices.

---

## 🎯 Project Purpose

The goal of this project is to provide a practical, scalable, and easy-to-understand automation framework that teaches:

- How to automate real Android apps using **Appium**
- How to structure tests with **Page Object Model (POM)**
- How to execute tests using **TestNG**
- How to design BDD tests using **Cucumber**
- How to inspect elements using **Appium Inspector**
- How to generate visual test results using **Allure Reports**

This project is perfect for beginners moving toward mid-level mobile automation skills.

---

## 🧪 Automated Test Scenarios

The framework contains **five key real-world scenarios**:

### **Scenario 1 — Add a New Task**
Verify that the user can create a new task with title and description.

### **Scenario 2 — Edit an Existing Task**
Ensure that the user can update an existing task.

### **Scenario 3 — Delete a Task**
Validate that the user can delete a task from the list.

### **Scenario 4 — Mark a Task as Completed**
Check that the user can mark a task as completed.

### **Scenario 5 — Filter Completed Tasks**
Verify that the user can filter and view only completed tasks.

---

## 📂 Project Structure




## 📂 Project Structure

DOIT-LIST-Automation/
│
├── src/main/java/
│ ├── Base/ # Driver initialization & configuration
│
├── src/test/java/
│ ├── Tests/ # TestNG test classes
│
│── StepDefinitions/ # Cucumber step definitions
│
│ ├── Hooks/ # Cucumber hooks for setup/teardown
│
│ ├── LocalStepDef/ # Local step definitions (custom logic)
│
├── resources/
│ └── capabilities.json # Appium desired capabilities
│
├── Features/ # Cucumber BDD .feature files
│
└── README.md




---

## 🚀 Tech Stack

| Tool / Technology | Purpose |
|------------------|---------|
| **Java** | Programming language |
| **Appium (UiAutomator2)** | Mobile automation engine |
| **TestNG** | Test execution and assertions |
| **Cucumber (BDD)** | Gherkin scenarios & BDD style |
| **Page Object Model** | Clean, scalable framework structure |
| **Android Studio** | Emulator, SDK & app debugging |
| **Appium Inspector** | Locator identification |
| **Allure Reporting** | Advanced reporting & test visualization |

---

## 🛠️ Installation & Setup

### **1️⃣ Install Dependencies**
Make sure you have installed:

- Java JDK 8+
- Maven
- Android Studio
- Appium Server
- Appium Inspector
- Node.js (for Appium)

Install Appium CLI:

```bash
npm install -g appium

2️⃣ Start Appium Server
appium

3️⃣ Launch Android Emulator

From Android Studio:

Tools → Device Manager → Start Emulator

▶️ Running Tests
4️⃣ Run TestNG Tests
mvn test

5️⃣ Run Cucumber Tests
mvn test -Dcucumber.filter.tags="@regression"

📊 Allure Report
Generate report
allure generate allure-results --clean -o allure-report

Open report
allure open allure-report

🧩 Sample Cucumber Feature
Feature: Manage tasks in DOIT LIST

  Scenario: Add a new task
    Given the user is on the DOIT LIST home screen
    When the user adds a task with title "Read Book" and description "15 pages"
    Then the task should appear in the task list

✨ Framework Highlights

✔ Beginner-friendly
✔ Real Android automation
✔ Clean Page Object Model
✔ Supports Both TestNG & Cucumber
✔ Uses Appium Inspector for stable element locators
✔ Integrated with Allure Reports
✔ Covers CRUD task operations
✔ Production-grade folder structure

🤝 Contributions

Contributions are welcome!
You can help by adding:

More test scenarios

Advanced gestures (swipe, scroll, long press)

CI/CD pipelines

Additional Allure customizations

📄 License

This project is open-source under the MIT License.

Happy Testing! 🚀
For questions or contributions, feel free to open an issue or pull request.


---

If you'd like, I can also:

✅ Add badges (Maven, Appium, Allure, Android)  
✅ Add screenshots of the emulator/tests  
✅ Add a table of contents  
✅ Improve professional styling  

Just tell me!


