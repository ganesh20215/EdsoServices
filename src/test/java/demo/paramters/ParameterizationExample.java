package demo.paramters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {


    @Parameters({"courseName", "cityName"})
    @Test
    public void verifySearchOnGoogle1(String courseName, String cityName){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(courseName +" " + cityName);
        element.sendKeys(Keys.ENTER);
        driver.close();
    }

    @Parameters({"courseName", "cityName2"})
    @Test
    public void verifySearchOnGoogle2(String courseName, String cityName2){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(courseName +" " + cityName2);
        element.sendKeys(Keys.ENTER);
        driver.close();
    }
}
