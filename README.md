# QAHybridAutomationFramework
Unified Automation Framework  A robust, scalable, and maintainable automation framework built using Java, Selenium, Appium, RestAssured, and Cucumber (BDD). Supports Web, Mobile, and API testing under a single framework with Page Object Model (POM) + Page Factory design pattern.


📌 Features

✅ Selenium WebDriver for Web UI testing

✅ Appium for Mobile Automation (Android & iOS)

✅ RestAssured for API Testing

✅ Cucumber BDD with Gherkin feature files

✅ Page Object Model (POM) with Page Factory

✅ TestNG / JUnit integration (parallel execution ready)

✅ Maven project for dependency management

✅ Cross-platform support (Windows, macOS, Linux, CI/CD)



📌 Explanation of Key Folders
🔹 base/

WebBasePage.java → reusable Selenium helpers (click, type, waitForElement, etc.)

ApiBase.java → base RestAssured setup (request/response specs, base URI, etc.)

DriverManager.java → handles WebDriver lifecycle

🔹 pages/

Follows Page Object Model with PageFactory

One class = one web page

🔹 api/

clients/ → API methods (getUser(), login(), updateUser())

models/ → request/response POJOs mapped using Jackson/Gson

utils/ → common utilities like JSON schema validation, token manager

🔹 utils/

ConfigReader → reads properties (URL, credentials, etc.)

LoggerUtil → centralized logging (log4j2)

TestDataUtil → read test data from JSON/Excel

🔹 stepdefinitions/

Glue code for Cucumber BDD

WebSteps.java → UI steps

ApiSteps.java → API steps

Hooks.java → setup/teardown (WebDriver/Appium/RestAssured context)

🔹 runners/

Contains TestNG / JUnit runners for Cucumber

You can have separate runners for Web, API, or run all tests together

🔹 features/

Gherkin .feature files separated by type (web/, api/)

Example: login.feature, user.feature

