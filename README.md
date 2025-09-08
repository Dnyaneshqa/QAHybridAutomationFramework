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



automation-framework/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── base/               # Base classes (WebBasePage, MobileBasePage, ApiBase)
│   │   │   ├── pages/              # Page Object Models (Web + Mobile)
│   │   │   ├── utils/              # Utilities (config, driver factory, helpers)
│   │   │   └── api/                # API client & models (RestAssured)
│   │   └── resources/              # Config files, locators
│   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── stepdefinitions/    # Cucumber step definitions
│   │   │   ├── runners/            # Cucumber/TestNG runners
│   │   │   └── tests/              # Test classes
│   │   └── resources/
│   │       └── features/           # Gherkin feature files
│
│── pom.xml                         # Maven dependencies
│── README.md                       # Project documentation

