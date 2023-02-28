package demo.parallelExucution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionExample {

    @Test
    public void testCase1(){
        System.out.println("This is Before Method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.close();
    }

    @Test
    public void testCase2(){
        System.out.println("This is Before Method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://www.google.com");
        driver.close();
    }

    @Test
    public void testCase3(){
        System.out.println("This is Before Method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://www.amazon.in");
        driver.close();
    }

    @Test
    public void testCase4(){
        System.out.println("This is Before Method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://www.facebook.com");
        driver.close();
    }

    @Test
    public void testCase5(){
        System.out.println("This is Before Method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://www.flipkart.com");
        driver.close();
    }
}
