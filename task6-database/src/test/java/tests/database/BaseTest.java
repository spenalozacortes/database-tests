package tests.database;

import models.database.TestModel;
import org.testng.annotations.BeforeTest;
import steps.database.TestSteps;

import java.util.List;

public class BaseTest {

    private final TestSteps testSteps = new TestSteps();

    @BeforeTest
    public void setup() {
        // Get list of tests from database
        List<TestModel> tests = testSteps.getTests("33", 10);
        for (TestModel test : tests) {
            // Set current author and project
            test.setAuthor_id(1L);
            test.setProject_id(4L);
            testSteps.addTest(test);
        }
    }
}
