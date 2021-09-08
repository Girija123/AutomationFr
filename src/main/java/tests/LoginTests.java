package tests;

import functionLibrary.CommonFunctions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTests extends CommonFunctions {

    @Before
    public void beforeTest()
    {
        openBrowser();
        driver.get("http://www.next.co.uk");
    }

    @Test
    public void invalidLoginTest()
    {
        waitForTime(2);
        waitForElement(driver.findElement(By.xpath("/html/body/header/div[2]/section/section[3]/ul/li[1]/a")));
        driver.findElement(By.xpath("/html/body/header/div[2]/section/section[3]/ul/li[1]/a")).click();
        WebElement loginVerificationText = driver.findElement(By.xpath("//*[@id=\"pri\"]/div/div/div/h1"));
        Assert.assertTrue(loginVerificationText.isDisplayed());

        driver.findElement(By.id("EmailOrAccountNumber")).sendKeys("georgeLynn@samples.com");
        driver.findElement(By.name("Password")).sendKeys("Lynnn123");
        driver.findElement(By.name("SignInNow")).click();

        String expectedResultMsg = "sorry, we have been unable to sign you in.";
        String actualResultMsg = driver.findElement(By.xpath("//*[@id=\"pri\"]/div/div/div/div/div/span")).getText();
        Assert.assertEquals(expectedResultMsg, actualResultMsg);

    }

    @Test
    public void validLoginTestByEmail()
    {

    }

    @Test
    public void validLoginTestByCustomerNumber()
    {

    }

    @Test
    public void forgotPasswordLinkRedirectionVerification()
    {

    }

    @Test
    public void verifyShowHidePassword()
    {

    }

    @Test
    public void verifyRememberEmail()
    {

    }

    @Test
    public void verifyLinksReDirection()
    {

    }

    @After
    public void afterTest()
    {
        closeBrowser();
    }

}
