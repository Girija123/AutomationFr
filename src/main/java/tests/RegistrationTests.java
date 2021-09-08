package tests;

import functionLibrary.CommonFunctions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegistrationTests extends CommonFunctions {

    @Before
    public void beforeTest() {
        openBrowser();
        driver.get("http://www.next.co.uk");
        waitForTime(3);

    }

    @Test
    public void validateRegistrationWithValidData() {

    }

    @Test
    public void validateRegistrationWithInvalidData() {

    }

    @After
    public void afterTest() {
        closeBrowser();
    }
}
