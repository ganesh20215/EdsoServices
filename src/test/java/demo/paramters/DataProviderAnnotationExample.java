package demo.paramters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationExample {

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() {
        return new Object[][]{
                {"Selenium", "Pune"},
                {"Java", "Nashik"}};
    }

    @Test(dataProvider = "test-data")
    public void verifySearchOnGoogle1(String courseName, String cityName) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(courseName + " " + cityName);
        element.sendKeys(Keys.ENTER);
        driver.close();
    }
}
