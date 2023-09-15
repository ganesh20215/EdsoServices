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

    @AfterMethod
    public void afterMethodExample(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class Example");
    }

}
