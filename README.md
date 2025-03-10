# Mobile Automation Framework

This repository contains a test excellence automation framework designed for comprehensive mobile application testing. Using Appium, Java, and TestNG, this framework provides a structured and efficient approach to automate UI tests for Android and iOS applications.

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Running Tests](#running-tests)
- [Reporting](#reporting)
- [Contributing](#contributing)
- [License](#license)


## Features

- **Cross-Platform Support:**  Supports both Android and iOS platforms.
- **Data-Driven Testing:**  Integrates with external data sources (e.g., Excel, CSV, JSON) for parameterized testing.
- **Page Object Model (POM):**  Implements POM for enhanced code maintainability and reusability.
- **TestNG Framework:**  Utilizes TestNG for test organization, parallel execution, and reporting.
- **Appium Integration:**  Seamlessly integrates with Appium for interacting with mobile elements.
- **Extensive Logging:**  Provides detailed logs for debugging and analysis.
- **Customizable Reporting:**  Generates comprehensive HTML reports with screenshots of test failures.


## Tech Stack

- **Appium:**  For mobile automation.
- **Java:**  Programming language.
- **TestNG:**  Testing framework.
- **Maven:**  Build tool.
- **Log4j:**  Logging framework.
- **Allure:** Reporting library.


## Project Structure
├── src/main/java/<br>
│ └── wiki/testexcellence/<br>
│ ├── pages/ (Page Object classes)<br>
│ ├── tests/ (Test classes)<br>
│ ├── utils/ (Utility classes)<br>
│ └── base/ (Base classes for setup and teardown)<br>
├── src/test/resources/<br>
│ ├── testdata/ (Test data files)<br>
│ └── config.properties (Configuration file)<br>
├── pom.xml / build.gradle (Build file)<br>
└── testng.xml (TestNG configuration file)<br>


## Getting Started

1. **Prerequisites:** Ensure you have Java, Appium server, and Maven installed and configured.  Install necessary Android/iOS SDKs and platform tools.
2. **Clone the Repository:**
3. **Project Setup:** Import the project into your IDE (e.g., IntelliJ, Eclipse).
4. **Configuration:** Update the `config.properties` file with your application and device details (e.g., app path, platform version, device name).


## Running Tests

1. **Using Maven:** `mvn clean test`
2. **Specific Test Suites:**  Use TestNG's XML configurations to run specific test suites or groups.


## Reporting

Test results and reports will be generated in the `target/surefire-reports` directory.


## Contributing

Contributions are welcome! Please follow these guidelines:

1. Fork the repository.
2. Create a new branch for your feature.
3. Make your changes and commit them.
4. Push your branch to your forked repository.
5. Create a pull request.


## License

This project is licensed under the [MIT License](LICENSE).

