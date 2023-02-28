package demo.softassertexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {


    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("This is Before Method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();  //Important  //upcasting in Java
    }

    @Test(groups = {"smoke"})
    public void verifyFunctionName1() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("ganesh Jadhav");
        driver.findElement(By.id("password")).sendKeys("Password1!");
        driver.findElement(By.className("signinbtn")).click();
        String errorMessage = driver.findElement(By.xpath("//b[text()='Wrong username and password combination.']")).getText();
        softAssert.assertEquals(errorMessage, "Wrong username and password", "error message should be same");
        softAssert.assertEquals(driver.getTitle(), "Rediffmail", "title should be match");
        Thread.sleep(3000);
        softAssert.assertAll();
    }


    @AfterMethod
    public void afterMethodExample(){
        System.out.println("This is After Method");
        driver.close();
    }
}
