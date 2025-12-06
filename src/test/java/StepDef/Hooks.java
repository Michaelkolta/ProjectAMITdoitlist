package StepDef;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void setup() throws Exception {
        startDriver();
    }

    @After
    public void tearDown() {
        stopDriver();
    }
}
