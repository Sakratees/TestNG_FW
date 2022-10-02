
# Project Title

UI Automation of EBANQ application
## Authors

- [@Sakratees](https://github.com/Sakratees)


## selenium-testng-framework

A sample framework based on Page Object Model, Selenium, TestNG using Java.

This framework is based in Page Object Model (POM).

The framework uses:

- Java
- Selenium
- TestNG
- TestNG Reporter Log
- Configured acceptance criteria for each test case to Pass/Fail
- Default TestNg Report


## Documentation

The Framework design pattern is mentioned below

## src/main/java

- It contains 3 packages such as Base, Pages and Utils
- Base package contains the base class
- Pages package contains all the required page classes for automation
- Utils package contains helper method class and property reader class

## src/main/resources

- It has the config.properties file

## src/test/java

- It contains the test cases package.
- The entier functionality has been break down into 3 test cases
    - Login test case
    - Home test case
    - Transfer test case
- Each test case pass/fail accecptance criteria has been evaluated


## Running Tests

To run tests, run the testng.xml file

- testng xml Path : /TestNG_FW/testng.xml
- Report path : /TestNG_FW/test-output/index.html