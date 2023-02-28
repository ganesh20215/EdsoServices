package demo;

import org.testng.annotations.*;

public class AnnotationExample extends AnnotationExample2{

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class Example");
    }

    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("Before Method");
    }

    @Test(groups = {"smoke"})
    public void testCase1(){
        System.out.println("test case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("test case 2");
    }

    @Test(groups = {"smoke"})
    public void testCase3(){
        System.out.println("test case 3");
    }

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class Example");
    }

}
