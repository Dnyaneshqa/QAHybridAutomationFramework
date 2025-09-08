package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.getDriver(); // initialize driver before scenario
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver(); // quit driver after scenario
    }
}
