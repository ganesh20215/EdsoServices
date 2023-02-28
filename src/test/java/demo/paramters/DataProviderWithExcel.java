package demo.paramters;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name = "test-data")
    public Object[][] readExcelData() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\Ganesh\\OneDrive\\Desktop\\testData.xlsx", "testCase1");
        return arrObj;
    }

    public String[][] getExcelData(String filename, String sheetName) throws IOException {
        String[][] data = null;

        FileInputStream fileReader = new FileInputStream(filename);
        XSSFWorkbook workbook = new XSSFWorkbook(fileReader);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRow = sheet.getPhysicalNumberOfRows();
        int noOfCols = row.getLastCellNum();
        Cell cell;
        data = new String[noOfRow-1][noOfCols];

        for (int i=1; i<noOfRow; i++){
            for (int j=0; j<noOfCols; j++){
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
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
